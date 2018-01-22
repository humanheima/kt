package base.chapter2.dot_3

import base.chapter2.dot_3.Color.*

/**
 * Created by dumingwei on 2017/12/20 0020.
 */

/**
 * 在 when 结构中使用任意对象
 */

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Direct color")
        }

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}