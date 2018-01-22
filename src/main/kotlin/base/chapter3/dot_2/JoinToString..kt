/**
 * 注解文件名
 */
@file:JvmName("StringFunctions")

package base.chapter3.dot_2

import java.lang.StringBuilder

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

const val a=1
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, ";", "(", ")"))
    //调用函数时，显式表明标明参数的名称
    println(joinToString(list, separator = ";", prefix = "(", postfix = ")"))


    println(joinToStringWithDefaultArgs(list))
    println(joinToStringWithDefaultArgs(list, ","))
    println(joinToStringWithDefaultArgs(list, ";", "(", ")"))
    println(joinToStringWithDefaultArgs(list, separator = ";", postfix = ")"))
    println(joinToStringWithDefaultArgs(list, separator = ";", prefix = "(", postfix = ")"))
}

fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/**
 * 带默认参数的方法
 */
@JvmOverloads
fun <T> joinToStringWithDefaultArgs(collection: Collection<T>, separator: String = ", ", prefix: String = "",
                                    postfix: String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}