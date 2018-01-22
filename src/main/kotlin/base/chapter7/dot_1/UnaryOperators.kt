package base.chapter7.dot_1

import java.math.BigDecimal

/**
 * Created by dumingwei on 2018/1/3 0003.
 * 重载一元运算符
 */
operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(-p)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}