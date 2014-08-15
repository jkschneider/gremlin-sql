package com.github.jkschneider.gremlinsql

import com.tinkerpop.gremlin.groovy.Gremlin
import org.junit.Before
import org.junit.BeforeClass
import spock.lang.Specification
import spock.lang.Unroll

import static GremlinFromSqlBuilder.*

class GremlinFromSqlBuilderSpec extends Specification {
    @BeforeClass static void beforeAll() { Gremlin.load() }

    def g
    @Before void before() { g = SampleGraph.create() }


    void "Simple select"() {
        setup:
        def pipe = translateToGremlin("SELECT * FROM person", g)

        expect:
        pipe._label.dedup().collect() == ['person']
    }

    @Unroll
    void "Select with where clause demonstrating #description"() {
        setup:
        def pipe = translateToGremlin("select * from person where $whereClause", g)

        expect:
        pipe.lastName.collect() == ['schneider']

        where:
        whereClause                     |   description
        "person.firstName = 'jon'"      |   "string equality"
        "person.age = 30"               |   "numeric equality"
        "person.age > 29"               |   "greater than"
        "person.age >= 30"              |   "greater than or equal to"
        "person.age < 11"               |   "less than"
        "person.age <= 10"              |   "less than or equal to"
        "person.suffix != null"         |   "null equality and NOT equals"
    }
}
