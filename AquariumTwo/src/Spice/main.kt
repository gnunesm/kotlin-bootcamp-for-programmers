package Spice

fun main(args: Array<String>) {
//    val spices1 = listOf(
//        Spice("curry", "mild"),
//        Spice("pepper", "medium"),
//        Spice("cayenne", "spicy"),
//        Spice("ginger", "mild"),
//        Spice("red curry", "medium"),
//        Spice("green curry", "mild"),
//        Spice("hot pepper", "extremely spicy")
//    )
//
//    val spice = Spice("cayenne", spiciness = "spicy")
//
//    val spiceList = spices1.filter {it.heat < 5}

    val curry = Curry("curry", "spicy")
    println(curry.color)

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}