fun main(args: Array<String>) {
    var fortune: String = ""

    while (fortune != "Take it easy and enjoy life!") {
        fortune = getFortune(getBirthday())
        println("Your fortune is: $fortune")
    }
}

fun getFortune(birthday: Int): String {
    val fortunesList = listOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
    when (birthday) {
        28, 31 -> return "You will have a great day!"
        in 1..7 -> return "Things will go well for you today."
        else -> return fortunesList[birthday.rem(fortunesList.size)]
    }

}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?:1
}