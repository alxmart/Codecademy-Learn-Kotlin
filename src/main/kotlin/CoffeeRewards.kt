fun main() {
    var rewardsPoints = 17
    var memberType: String
    // Write your code below
    if (rewardsPoints >= 50) {
        memberType = "Platinum"
    } else if (rewardsPoints >= 25) {
        memberType = "Gold"
    } else if (rewardsPoints >= 10) {
        memberType = "Silver"
    } else {
        memberType = "Bronze"
    }

    println("You are a $memberType type member.")

}