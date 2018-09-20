package Figuras

var altura: Int=0
var contador: Int=1

override fun getDescription() {
    println("Escriba la altura del triangulo:")
    this.altura = Integer.parseInt(readLine())
}
