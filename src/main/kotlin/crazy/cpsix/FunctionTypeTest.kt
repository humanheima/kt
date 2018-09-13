fun main(args: Array<String>) {
    // 定义一个变量，其类型为(Int , Int) -> Int
    var myfun: (Int, Int) -> Int
    // 定义一个变量，其类型为(String) -> Unit
    var test: (String)
    // 定义一个计算乘方的函数
    fun pow(base: Int, exponent: Int): Int {
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        return result
    }
// 将::pow函数赋值给myfun，则myfun可当成pow使用
    myfun = ::pow
    println(myfun(3, 4)) // 输出81
    // 定义一个计算面积的函数
    fun area(width: Int, height: Int): Int {
        return width * height
    }
// 将area函数赋值给myfun，则myfun可当成area使用
    myfun = ::area
    println(myfun(3, 4)) // 输出12
}