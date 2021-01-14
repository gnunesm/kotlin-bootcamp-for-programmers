fun main(args: Array<String>) {
    println(fitMoreFish(10.0, listOf(3,3,3)))
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(fitMoreFish(9.0, listOf(1,1,3), 3))
    println(fitMoreFish(10.0, listOf(), 7, true))
}

fun fitMoreFish(
        tankSize: Double,
        currentFish: List<Int>,
        fishSize: Int = 2,
        hasDecorations: Boolean = true): Boolean {
    if (hasDecorations)
        return fishSize + currentFish.sum() <= 0.8 * tankSize
    else
        return fishSize + currentFish.sum() <= tankSize
}