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

    void "Select all"() {
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
        "person.age = 30.0"             |   "numeric equality with like numeric type"
        "person.age > 29"               |   "greater than"
        "person.age >= 30"              |   "greater than or equal to"
        "person.age < 11"               |   "less than"
        "person.age <= 10"              |   "less than or equal to"
        "person.suffix != null"         |   "null equality and NOT equals"
        "person.age in (29,30)"         |   "list containment"
    }

    void "Select with where clauses joined by AND"() {
        setup:
        def pipe = translateToGremlin("select * from person where $whereClause", g)

        expect:
        pipe.lastName.collect() == expectedResult

        where:
        whereClause                                         |   expectedResult
        "person.firstName = 'jon' and person.age = 30"      |   ['schneider']
        "person.firstName = 'jon' and person.age = 40"      |   []
    }

    void "Select with where clauses joined by OR"() {
        setup:
        def pipe = translateToGremlin("select * from person where $whereClause", g)

        expect:
        pipe.lastName.collect() == expectedResult

        where:
        whereClause                                                       |   expectedResult
        "person.firstName = 'jon' or person.firstName = 'christine'"      |   ['schneider', 'schneider']
        "person.age = 30 or person.age = 40"                              |   ['schneider']
        "person.age = 40 or person.age = 50"                              |   []
    }

    void "Select statement with join"() {
        setup:
        def pipe = translateToGremlin("select * from person inner join address on '(person)-address->(*)'", g)

        expect:
        pipe.lastName.collect() == ['schneider']
    }
}
