package base.chapter6.dot_1

/**
 * Created by dumingwei on 2018/1/1 0001.
 */
fun strLenSafe(s: String?): Int = s?.length ?: 0

fun main(args: Array<String>) {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}