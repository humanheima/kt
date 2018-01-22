package base.chapter7.dot_1

/**
 * Created by dumingwei on 2018/1/3 0003.
 */
/**
 * 定义一个运算数类型不同的运算符
 */
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Double.times(point: Point): Point {
    return Point((toDouble() * point.x).toInt(), (toDouble() * point.y).toInt())
}

/**
 * 定义一个返回结果不同的运算符
 */
operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(p * 1.5)
    println(2.0 * p)
    print('a' * 4)
}