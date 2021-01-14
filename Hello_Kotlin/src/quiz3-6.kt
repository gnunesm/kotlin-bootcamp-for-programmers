fun main(args: Array<String>) {
    println(whatShouldIDoToday())
}

fun whatShouldIDoToday(
        weather: String = "sunny",
        temperature: Int = 24
): String {

    print("How are you feeling today? ")
    val mood = readLine()!!

    val activity = when {
        isWalkingVibe(mood, weather) -> "go for a walk"
        isBedVibe(mood, weather, temperature) -> "stay in bed"
        isSwimmingVibe(temperature) -> "go swimming"
        else -> "stay home and read"
    }

    return "Today you should $activity."
}

fun isWalkingVibe(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isBedVibe(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isSwimmingVibe(temperature: Int) = temperature > 35