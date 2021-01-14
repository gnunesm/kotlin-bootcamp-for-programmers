enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Directions.START)

    val north: () -> Unit = { path.add(Directions.NORTH) }
    val south: () -> Unit = { path.add(Directions.SOUTH) }
    val east: () -> Unit = { path.add(Directions.EAST) }
    val west: () -> Unit = { path.add(Directions.WEST) }

    val end: () -> Unit = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
    }

    fun move(where: () -> Unit) {
        where()
    }

    fun makeMove(command: String?) {
        when (command) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main(args: Array<String>) {
    val game = Game()

    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}
