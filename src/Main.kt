package main

import Figuras
import Proporciones.tamaños


fun menu(): String {
        return """
            Menu:
            1. Crear lista
            2. Salir
        """.trimIndent()
    }

fun menu2(): String {
        return """
            Menu:
            1. Dibujar un cuadrado
            2. Dibujar un rectangulo
            3. Dibujar un triangulo
            4. Salir al menu principal
        """.trimIndent()
    }

fun main(args: Array<String>) {
    var wantsToContinue = true
    do {
        println(menu())
        print("Ingrese una opcion del menu (1 - 2): ")
        val option = readLine()!!.toInt()

        when (option) {
            1 -> {
                println(menu2())
                print("Ingrese una opcion del menu (1 - 4): ")
                val option2 = readLine()!!.toInt()
                when (option2) {
                    1 -> {


                    }
                    4 -> {
                        wantsToContinue = false
                    }
                }
            }

            2 -> {
                wantsToContinue = false
            }
        }
    } while (wantsToContinue)
}
