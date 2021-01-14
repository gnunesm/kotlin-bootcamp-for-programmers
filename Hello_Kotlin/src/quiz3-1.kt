import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")

    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("It's Sunday.")
        2 -> println("It's Monday.")
        3 -> println("It's Tuesday.")
        4 -> println("It's Wednesday.")
        5 -> println("It's Thursday.")
        6 -> println("It's Friday.")
        else -> println("It's Saturday.")
    }
}