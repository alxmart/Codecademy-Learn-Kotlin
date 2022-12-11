fun main() {

    val game = listOf("Rock", "Paper", "Scissor")

    rps@ for (p1 in game) {
        for (p2 in game) {
            if (p1 == "Paper") {
                break@rps
            }
            println("$p1 vs. $p2")
        }
    }
}
//Output:
//Rock vs. Rock
//Rock vs. Paper
//Rock vs. Scissor