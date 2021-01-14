fun List<Int>.filterDivBy(block: Int.() -> Int): List<Int> {
    return filter { it.block() == 0 }
}

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    print(numbers.filterDivBy {
        rem(3)
    })
}