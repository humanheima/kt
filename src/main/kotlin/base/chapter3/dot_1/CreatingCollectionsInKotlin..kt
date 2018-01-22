package base.chapter3.dot_1

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

val hashSet = hashSetOf(1, 7, 53)
val list = listOf(1, 7, 53)
val arrayList = arrayListOf(1, 7, 53)
val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
fun main(args: Array<String>) {
    println(hashSet.javaClass)
    println(list.javaClass)
    println(arrayList.javaClass)
    println(map.javaClass)
    println(hashSet.max())
    println(list.last())
}