package base.chapter6.dot_3

/**
 * Created by dumingwei on 2018/1/2 0002.
 */
fun main(args: Array<String>) {
    val letters = Array<String>(26) { i ->
        ('a' + i).toString()
    }
    println(letters.joinToString(""))
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    val squares = IntArray(5) { i ->
        (i + 1) * (i + 1)
    }
    println(squares.joinToString())
}