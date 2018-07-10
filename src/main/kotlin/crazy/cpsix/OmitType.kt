/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
fun main(args: Array<String>) {
    // 由于程序定义了square变量的类型
    // 因此Kotlin可以推断Lambda表达式的形参类型
    // 因此Lambda表达式可以省略形参类型
    var square: (Int) -> Int = { n -> n * n }
    // 使用square调用Lambda表达式
    println(square(5))  // 输出25
    println(square(6))  // 输出36
    // 此时Kotlin无法推断base、exponent两个形参的类型，
    // 因此必须为其指定类型
    var result = { base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    }(4, 3)
    println(result)  // 输出64
    var list = listOf("Java", "Kotlin", "Go")
    // 使用Lambda表达式定义去除条件：长度大于3的集合元素被去除
    // 由于dropWhile()方法的形参是(T) -> Boolean类型，
    // 因此调用该方法时可省略形参类型
    var rt = list.dropWhile({ e -> e.length > 3 })
    println(rt) // 输出[Go]
}