/**
 * 重载运算符
 */
data class Data(val x: Int, val y: Int) {
    // 为Data类定义一个unaryMinus()方法
    operator fun unaryMinus(): Data {
        return Data(-x, -y)
    }

    operator fun inc(): Data = Data(x + 1, y + 1)

}

// 以扩展方法的形式为Data类定义not()方法
operator fun Data.not(): Data {
    return Data(-x, -y)
}

operator fun Data.dec(): Data {
    return Data(x - 1, y - 1)
}

fun main(args: Array<String>) {
    var d = Data(4, 10)
    println(-d) // 输出Data(x=-4, y=-10)
    println(!d) // 输出Data(x=-4, y=-10)

    var e = Data(4, 10)
    var f = Data(4, 10)
    println(e++)
    println(++e)
    println(--f)
}