package com.github.jkschneider.gremlinsql

import com.tinkerpop.gremlin.groovy.Gremlin
import com.tinkerpop.gremlin.java.GremlinPipeline
import org.junit.BeforeClass
import spock.lang.Specification

/**
 * Flush out the gremlin concepts we will be using to perform the mapping.
 * This really exists simply because I don't know all the dark corners of Gremlin perfectly.
 */
class ConceptsSpec extends Specification {
    @BeforeClass static void before() { Gremlin.load() }

    void "Disjoint pipelines can be composed with `step`"() {
        setup:
        def g = SampleGraph.create()

        GremlinPipeline pipe1 = g.V

        // notice how pipe2 doesn't need to be connected to any existing traversal just yet
        def pipe2 = new GremlinPipeline().has('_label', 'person')

        // ...it can be connected just in time
        pipe1.step(pipe2)

        expect:
        pipe1.next()?._label == 'person'
    }

    /**
     * Useful when we want to flatten all the selected properties for a result set style representation
     */
    void "`select` can be used to flatten properties from each type into a row"() {
        setup:
        def g = SampleGraph.create()

        // one selector for each type included in the result set
        def selector = {
            it.map().findAll { k, v -> k != '_label' }.values()
        }

        expect:

        g.V.has('_label', 'person').as('person')
            .out('address').as('address')
            .select(selector, selector)
            .collect { it.flatten() } ==
                [['jon', 'schneider', '123 someplace']]
    }
}
