fun main() {
    val favoriteColors = mapOf(
        "Jesse" to "Violet",
        "Megan" to "Red",
        "Tamala" to "Blue",
        "Jordan" to "Pink"
    )

    println("\n-- Key: Value Output --")

    for (favoriteEntry in favoriteColors) {
        println("${favoriteEntry.key}: ${favoriteEntry.value}")
    }
//    -- Key: Value Output --
//    Jesse: Violet
//    Megan: Red
//    Tamala: Blue
//    Jordan: Pink

    println("\n-- Only Values Output --")

    for (color in favoriteColors.values) {
        println(color)
    }
//    -- Only Values Output --
//    Violet
//    Red
//    Blue
//    Pink

}