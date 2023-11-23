import clases.*

fun main(){
    val viajeMonterrey = National(city = "Monterrey")
    viajeMonterrey.reserve(numDays = 4)
    val viajeBajaMonterrey = NationalLowSeason(city = "Monterrey")
    viajeBajaMonterrey.reserve(numDays = 3)

}