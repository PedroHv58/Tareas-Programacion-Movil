//Tipo de triangulo -  Hernandez Villagomez Pedro
fun main() {
    val lado_1 = 5
    val lado_2 = 5
    val lado_3 = 5

    val tipo = TipoDeTriangulo(lado_1, lado_2, lado_3)
    println("Es un $tipo")
}

fun TipoDeTriangulo(lado_1: Int, lado_2: Int, lado_3: Int): String {
    if (lado_1 == lado_2 && lado_2 == lado_3) {
        return "triángulo equilátero"
    } else if (lado_1 == lado_2 || lado_2 == lado_3 || lado_3 == lado_1) {
        return "triángulo isósceles"
    } else {
        return "triángulo escaleno"
    }
}