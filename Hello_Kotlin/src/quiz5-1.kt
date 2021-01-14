import java.util.*

const val MAX_BORROWED = 5

class Book (val title: String, val author: String, val year: Int, var pages: Int) {

    companion object {
        const val BASE_URL = "https://url.com"
    }

    fun titleAuthor(): Pair<String, String> {
        return title to author
    }

    fun titleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BORROWED
    }

    fun printUrl() {
        println("$BASE_URL/$title.html")
    }

}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(book.pages + 1))
    }
}

fun Book.getWeight() = pages * 1.5

fun Book.tornPages(tornNumber: Int) {
    pages -= tornNumber
}

fun main(args: Array<String>) {
    val book = Book("Animal Farm", "George Orwell", 1945, 350)
    val (title, author, year) = book.titleAuthorYear()

    println("Here is your book $title written by $author in $year.")

    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println(book.pages)
    }
}