package base.chapter2.dot_4

/**
 * Created by dumingwei on 2017/12/21 0021.
 */

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
println(isLetter('q'))
println(isNotDigit('x'))

}