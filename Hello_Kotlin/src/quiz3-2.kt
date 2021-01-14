fun main(args: Array<String>) {
//    if (args[0].toInt() < 12) {
//        println("Good morning, Kotlin")
//    }
//    else {
//        println("Good night, Kotlin")
//    }
    println("Good ${if(args[0].toInt() < 12) "morning" else "night"}, Kotlin")
}