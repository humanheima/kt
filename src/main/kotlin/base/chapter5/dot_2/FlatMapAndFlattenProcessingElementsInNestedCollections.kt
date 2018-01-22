package base.chapter5.dot_2

/**
 * Created by dumingwei on 2017/12/24 0024.
 */
data class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett",
                    "Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet())
    println(listOf(books).flatten())

}