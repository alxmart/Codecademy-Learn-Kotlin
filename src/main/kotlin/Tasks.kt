fun main() {

   val mySchedule = listOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",
                            "Clean Up", "Work", "Eat Dinner", "Clean Up")

    val myTasks = setOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",
                        "Clean Up", "Work", "Eat Dinner", "Clean Up")


    println("-- mySchedule Output --")

    for (task in mySchedule) {
        println(task)
    }


    println("\n-- myTasks Output --")

    for ((taskIndex, task) in myTasks.withIndex()) {
        println("$taskIndex: $task")
    }

}

/*   OUTPUT:

-- mySchedule Output --
Eat Breakfast
Clean Up
Work
Eat Lunch
Clean Up
Work
Eat Dinner
Clean Up

-- myTasks Output --
0: Eat Breakfast
1: Clean Up
2: Work
3: Eat Lunch
4: Eat Dinner

 */
