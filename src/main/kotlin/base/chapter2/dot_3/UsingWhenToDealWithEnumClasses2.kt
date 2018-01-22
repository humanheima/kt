package base.chapter2.dot_3

import base.chapter2.dot_3.Color.*

/**
 * Created by dumingwei on 2017/12/20 0020.
 */

/**
 * 导入枚举常量后，不用限定词就可以访问
 */
fun main(args: Array<String>) {
    println(getWarmth2(Color.ORANGE))
}

fun getWarmth2(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}