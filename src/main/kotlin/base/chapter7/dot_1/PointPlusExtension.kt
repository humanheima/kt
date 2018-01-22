package base.chapter7.dot_1

/**
 * Created by dumingwei on 2018/1/3 0003.
 */
data class Point(val x: Int, val y: Int)

/**
 * 定义一个plus运算符
 */
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    var p2 = Point(30, 40)
    println(p1 + p2)
    p2 += Point(3, 4)
    println(p2)
}