class Cat (
    val name: String,
    val breed: String
) {
    fun speak() {
        println("Meow!")
    }
}

fun main() {
    var myCat = Cat("Garfield","Persian")
    myCat.speak()
}
