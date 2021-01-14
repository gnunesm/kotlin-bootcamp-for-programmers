fun main(args: Array<String>) {
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")

    val library = mapOf("William Shakespeare" to allBooks)

    println(library.any {it.value.contains("Hamlet")})

    val moreBooks = mutableMapOf("Lord of the Rings" to "J.R.R. Tolkien")

    moreBooks.getOrPut("Brave New World") { "Aldous Huxley" }
}

