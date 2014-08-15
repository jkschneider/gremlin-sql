package com.github.jkschneider.gremlinsql

import com.tinkerpop.blueprints.Vertex
import com.tinkerpop.blueprints.impls.tg.TinkerGraph

class SampleGraph {
    static create() {
        def sample = new SampleGraph()

        def pv = sample.buildPerson('jon', 'schneider', 30)
        sample.buildPerson('christine', 'schneider', 28)
        sample.buildPerson('mike', 'schneider', 10, 'jr')
        def av = sample.buildAddress('123 someplace')
        pv.addEdge('address', av)

        return sample.g
    }

    def g = new TinkerGraph()

    Vertex buildPerson(String firstName, String lastName, Integer age, String suffix = null) {
        def pv = g.addVertex(null)
        pv['_label'] = 'person'
        pv['firstName'] = firstName
        pv['lastName'] = lastName
        pv['age'] = age
        if(suffix) pv['suffix'] = suffix
        return pv
    }

    Vertex buildAddress(String street) {
        def av = g.addVertex(null)
        av['_label'] = 'address'
        av['street'] = street
        return av
    }
}
