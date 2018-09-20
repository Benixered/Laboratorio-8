package   Figuras

import Proporciones.tamaños

open class : tamaños {

    var alto: Int
    var ancho: Int

        set(value) {
            field = value
        }

    private set

    override var steps = 0

    constructor(_alto: Int = 0, _ancho: Int = 0) {
        alto = _alto
        ancho = _ancho

    }

    override fun dot() {
        steps += 1
        println("*")
    }

    override fun toString(): String {
        return """
            Altura: ${alto}
            Anchura: ${ancho}
        """.trimIndent()
    }
}