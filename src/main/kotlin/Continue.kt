fun main() {
    val myNumbers = listOf(4, 8, 2, 9, 12, 7, 16, 10, 3)

    for (num in myNumbers) {
        if (num > 9) {
            continue
        }
        println(num)
    }
}