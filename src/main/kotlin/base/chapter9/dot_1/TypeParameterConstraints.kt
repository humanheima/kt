package base.chapter9.dot_1

/**
 * Created by dumingwei on 2018/1/7 0007.
 */
fun <T : Comparable<T>> max(first: T, second: T): T {

    return if (first > second) first else second
}

/**
 * 为类型参数指定多个约束
 *
 */
fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.'))
        seq.append('.')
}

fun main(args: Array<String>) {
    println(max("kotlin", "java"))

    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}