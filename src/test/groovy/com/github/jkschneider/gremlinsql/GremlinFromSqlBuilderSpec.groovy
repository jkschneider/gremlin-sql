package com.github.jkschneider.gremlinsql

import com.tinkerpop.blueprints.impls.tg.TinkerGraph
import com.tinkerpop.gremlin.groovy.Gremlin
import com.tinkerpop.gremlin.java.GremlinPipeline
import org.junit.BeforeClass
import spock.lang.Specification

class GremlinFromSqlBuilderSpec extends Specification {
    @BeforeClass static void before() { Gremlin.load() }

    void "Simple select"() {
        setup:
        def g = SampleGraph.create()
        def pipe = GremlinFromSqlBuilder.translateToGremlin("SELECT * FROM person", g)

        expect:
        pipe._label.dedup().collect() == ['person']
    }
}
