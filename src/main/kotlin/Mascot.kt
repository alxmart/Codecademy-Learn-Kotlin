class Mascot(
    val name: String,
    val platform: String,
    val yearCreated: Int
) {
    var age: Int

    init {
        age = 2022 - yearCreated
        println("$name is a $platform mascot and is $age years old. ")
    }
}

fun main() {
    val codey = Mascot("Codey","Codecademy", 2018)
}