
fun main() {
    var name = "Kotlin"
    var age = 18
    var double  = 14.5
    var boolean = false
    name = "Maxi"
    println("Hola, " + name + "!")
    var nameLenght = name.length
    var nameArray = arrayOf(name)

    for (i in 1..5) {
        println("i = $i")
    }

    var palabra = name.contains("x")
    if (palabra) {
        boolean = true
    }
    println(boolean)

    var reemplazo = name.replace("x", "y")
    println(reemplazo)

    var edad = 49
    var compra = 16435.12375
    var nombre = "Maxi"
    var email = "sastremaxi@gmail.com"
    var oracion = "Hola, mi nombre es $nombre, tengo $edad años y mi email es $email"
    println(oracion)
    var stringFormat = String.format("Hola, mi nombre es %s, tengo %d años y mi email es %s. Ayer gasté $%.2f", name, edad, email, compra)
    println(stringFormat)


}