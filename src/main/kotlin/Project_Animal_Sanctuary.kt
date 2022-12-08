fun main() {
    // Write your code below 🏞

    var responsibilities = mutableListOf("feed the chimps",
        "play a random game", "conduct a health check on Foxie")

    var responsibilitiesComplete = 0

    var timeSpent = 0

    var totalShiftTime = 4

    var foxiesHealthCheck = mutableMapOf<String, Any?>()

    var chimpHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    println("First, ${responsibilities[0]}.")

    println("Feeding Bonnie....")
    chimpHaveEaten["Bonnie"] = true

    println("Feeding Jubilee...")
    chimpHaveEaten["Jubilee"] = true

    println("Feeding Frodo...")
    chimpHaveEaten["Frodo"] = true

    println("Feeding Foxie...")
    chimpHaveEaten["Foxie"] = true

    timeSpent += 1

    responsibilitiesComplete++

    println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities .")

    // SECOND RESP

    println ("Next, ${responsibilities[1]}")

    var games = mutableSetOf("tug-of-war with a blanket",
                             "catch and throw", "number game")

    var randomGame = games.random()

    println (randomGame)

    timeSpent++

    responsibilitiesComplete ++

   println("Each animal has now played a game of $randomGame! You've " +
           "completed $responsibilitiesComplete / ${responsibilities.size}" +
           " responsibilities.")

    //THIRD RESP

     println ("Next, ${responsibilities[2]}")

    foxiesHealthCheck.put("temperature", 32.7)

    foxiesHealthCheck.put("mood", "happy")

    println ("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} " +
            "and is feeling  ${foxiesHealthCheck["mood"]}")

    timeSpent++

    responsibilitiesComplete ++

    println("You've now completed ${responsibilitiesComplete} / " +
            "${responsibilities.size} responsibilities.")

    if (timeSpent <= totalShiftTime &&
        responsibilitiesComplete == responsibilities.size) {
           println("\nAwesome work! You've completed all of your" +
                   " responsibilites for the day, and you can clock out.")
    } else if (timeSpent >= totalShiftTime &&
        responsibilitiesComplete == responsibilities.size) {
                println("Great job today! You've completed all of your" +
                        " responsibilities but with over time.")
    } else {
         println("You went over time and did not complete all of your" +
                 " responsibilites.")
    }
}