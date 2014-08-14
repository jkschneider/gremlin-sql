package com.github.jkschneider.gremlinsql

import com.tinkerpop.blueprints.impls.tg.TinkerGraph

class SampleGraph {
    static create() {
        def g = new TinkerGraph()

        def pv = g.addVertex(null)
        pv['_label'] = 'person'
        pv['firstName'] = 'jon'
        pv['lastName'] = 'schneider'

        def av = g.addVertex(null)
        av['_label'] = 'address'
        av['street'] = '123 someplace'

        pv.addEdge('address', av)

        return g
    }
}
