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
        def g = new TinkerGraph()
        def v = g.addVertex(null)
        v['_label'] = 'person'

        def pipe = GremlinFromSqlBuilder.translateToGremlin("SELECT * FROM person", g)

        expect:
        pipe.collect() == [v]
    }

    void "Disjoint pipelines can be composed with `step`"() {
        setup:
        def g = new TinkerGraph()
        def v = g.addVertex(null)
        v['_label'] = 'person'

        GremlinPipeline pipe1 = g.V

        // notice how pipe2 doesn't need to be connected to any existing traversal just yet
        def pipe2 = new GremlinPipeline().has('_label', 'person')

        // ...it can be connected just in time
        pipe1.step(pipe2)

        expect:
        pipe1.next() == v
    }
}
