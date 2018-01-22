package base.chapter2.dot_3

/**
 * Created by dumingwei on 2017/12/20 0020.
 */

fun main(args: Array<String>) {
println(getMnemonic(Color.RED))
}

fun getMnemonic(color: Color) = when (color) {
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    Color.GREEN -> "Gave"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"
}