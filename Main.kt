//Variables y Tipos de Datos

const val PI = 3.1416f
fun main() {
    //NumeroDecimal = Radio
    val NumeroDecimal = 18.5f
    val Perimetro= Perimetro(NumeroDecimal)
    println("El tipo de dato por defecto para un numero decimal es: ${NumeroDecimal::class.simpleName}")
    println("El perimetro del circulo es : $Perimetro")
}
fun Perimetro(NumeroDecimal:Float): Float{
    return PI*(2*NumeroDecimal)
}