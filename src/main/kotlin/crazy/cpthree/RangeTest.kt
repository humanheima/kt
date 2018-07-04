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
    // 使用闭区间运算符定义区间
    var range1 = 2..6
    for (num in range1) {
        println("${num} * 5 = ${num * 5}")
    }

    // 定义数组
    val books = arrayOf("Swift", "Kotlin", "C", "C++")
    // 使用半开区间运算符定义区间
    for (index in 0 until books.size) {
        println("第${index + 1}种语言是：${books[index]}")
    }
}