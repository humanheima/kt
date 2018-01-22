package base.chapter7.dot_3

import base.chapter7.dot_1.Point

/**
 * Created by dumingwei on 2018/1/4 0004.
 */
operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(p[0])
    println(p[1])
    val p1=MutablePoint(10,20)
    p1[0]=42
    println(p1)
}