package base.chapter9.dot_2

/**
 * Created by dumingwei on 2018/1/7 0007.
 */

inline fun<reified T>isA(value:Any)=value is T

fun main(args: Array<String>) {
    println(isA<String>("abc"))
    println(isA<String>(2))
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}