package base.chapter2.dot_3

import base.chapter2.dot_3.Color.*

/**
 * Created by dumingwei on 2017/12/20 0020.
 */

/**
 * 使用不带参数的 when
 */
fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
            (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
            (c1 == VIOLET && c2 == BLUE) || (c1 == BLUE && c2 == VIOLET) -> INDIGO
            else -> throw Exception("Direct color")
        }

fun main(args: Array<String>) {
    println(mixOptimized(BLUE, YELLOW))
}