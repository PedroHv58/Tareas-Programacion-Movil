//Operadores Practica 3
fun main() {
    val x1 = 4
    val y1 = 3
    val x2 = -3
    val y2 = -2

    val m = pendiente(x1, y1, x2, y2)

    println("La pendiente es: $m")
}
//Funcion para calcular la pendiente
fun pendiente(x1: Int, y1: Int, x2: Int, y2: Int): Double {
    // Expresarla ahora con operadores.
    return (y2 - y1).toDouble() / (x2 - x1).toDouble()
}





