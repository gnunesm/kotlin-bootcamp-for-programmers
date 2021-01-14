fun main(args: Array<String>) {
    var fortune: String

    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        if (fortune == "Take it easy and enjoy life!")
            break
    }
}

fun getFortuneCookie(): String {
    val fortunesList = listOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: ")
    var birthday = readLine()?.toIntOrNull() ?:1
    return fortunesList[birthday.rem(fortunesList.size)]
}