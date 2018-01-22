package base.chapter6.dot_1

/**
 * Created by dumingwei on 2018/1/1 0001.
 */
fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls(null)
}