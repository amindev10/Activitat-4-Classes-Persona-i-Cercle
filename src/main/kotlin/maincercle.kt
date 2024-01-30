fun main() {
    fun main() {
        var cercleActual = Cercle(0.0F)
        var opcio: String

        do {
            println("\nMenú:")
            println("1.- Crear un cercle amb un radi determinat i un color determinat")
            println("2.- Crear un cercle amb un radi determinat")
            println("3.- Mostrar últim cercle creat")
            println("4.- Mostrar perímetre últim cercle creat")
            println("5.- Mostrar àrea últim cercle creat")
            println("6.- Sortir")

            opcio = readln()

            when (opcio) {
                "1" -> {
                    print("Introdueix el radi: ")
                    val radi = readln().toFloat()
                    print("Introdueix el color: ")
                    val color = readln()
                    cercleActual = Cercle(radi, color)
                    println("Cercle creat amb radi: $radi i color: $color.")
                }
                "2" -> {
                    print("Introdueix el radi: ")
                    val radi = readln().toFloat()
                    cercleActual = Cercle(radi)
                    println("Cercle creat amb radi: $radi.")
                }
                "3" -> {
                    println("Últim cercle creat: $cercleActual")
                }
                "4" -> {
                    println("Perímetre de l'últim cercle creat: ${cercleActual.permimetre()}")
                }
                "5" -> {
                    println("Àrea de l'últim cercle creat: ${cercleActual.area()}")
                }
                "6" -> {
                    println("Has seleccionat Sortir del programa, fins despres!!")
                }
                else -> {
                    println("Opció no vàlida. Si us plau, tria una opció que estigui al menú.")
                }
            }
        } while (opcio != "6")
    }
}