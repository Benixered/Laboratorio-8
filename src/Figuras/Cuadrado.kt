package Figuras

import Proporciones.tamaños

open class : tamaños {

    var alto: Int


        set(value) {
            field = value
        }

        private set

    override var steps = 0

    constructor(_alto: Int = 0) {
        alto = _alto


    }

    override fun dot() {
        steps += 1
        println("*")
    }

    override fun toString(): String {
        return """
            Altura: ${alto}
            Anchura: ${alto}
        """.trimIndent()
    }
}