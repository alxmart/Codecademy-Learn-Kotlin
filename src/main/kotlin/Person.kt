
class Person (
    val name: String,
    val age: Int,
    val favoriteColor: String
)

fun main() {
    // Create your instances below

    val me = Person("Alex", 51, "Dark Blue")

    val myFriend = Person("Homer", 48, "Red")

    println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}")

    println()

    println("${myFriend.name} is ${myFriend.age} years old and his favorite color is ${myFriend.favoriteColor}")


}