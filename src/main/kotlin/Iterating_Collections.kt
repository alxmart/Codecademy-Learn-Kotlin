fun main() {

    val fruitList = listOf("apples", "oranges", "bananas")

    for (fruit in fruitList) {
        println("I have $fruit.")
    }

    println()

    //-----------------------------------------------------------

    val fruitSet = setOf("apples", "oranges", "bananas")

    for (setIndex in fruitSet.indices) {
        println("Index = $setIndex")
    }

    println()
    //-----------------------------------------------------------

    val fruitList2 = listOf("apples", "oranges", "bananas")

    for ((listIndex, fruit) in fruitList2.withIndex()) {
        println("$listIndex is the index of the element $fruit")
    }

    //-----------------------------------------------------------------




}


