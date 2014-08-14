package com.github.jkschneider.gremlinsql

import spock.lang.Specification

class GremlinFromSqlBuilderSpec extends Specification {
    void "Simple select"() {
        setup:
        def builder = new GremlinFromSqlBuilder()
        builder.translateToGremlin("SELECT * FROM person")

        expect:
        true
    }
}
