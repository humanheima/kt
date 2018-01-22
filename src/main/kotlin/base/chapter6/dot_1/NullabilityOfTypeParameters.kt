package base.chapter6.dot_1

/**
 * Created by dumingwei on 2018/1/1 0001.
 */
fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main(args: Array<String>) {
    printHashCode(null)
}