package base.chapter2.dot_3

/**
 * Created by dumingwei on 2017/12/20 0020.
 */

/**
 * 在一个when上合并多个选项
 */

fun main(args: Array<String>) {
    println(getWarmth(Color.ORANGE))
}

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}