//class Car2 {
//    val year = 2023
//    val model = "Jeep"
//    val color = "Red"
//}

class Car2(
    val year: Int,
    val model: String,
    val color: String
)

fun main() {

    val myCar2 = Car2(2011, "Jeep", "Blue")

    val friendsCar = Car2(2015, "Mazda", "Red")

    println(myCar2.year)
    println(myCar2.model)
    println(myCar2.color)
    println()

    println(friendsCar.year)
    println(friendsCar.model)
    println(friendsCar.color)


}