package Book

open class Book (val title: String, val author: String) {
    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, val format: String = "text"): Book(title, author) {
    private var currentWordCount = 0

    override fun readPage() {
        currentWordCount += 250
    }
}