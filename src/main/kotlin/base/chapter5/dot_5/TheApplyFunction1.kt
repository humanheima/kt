package base.chapter5.dot_5

/**
 * Created by dumingwei on 2017/12/26 0026.
 */
fun alphabet4() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main(args: Array<String>) {
    println(alphabet4())
}