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

// 下面定义了4个“宏变量”
const val a = 5 + 2
const val b: Double = 1.2 / 3
const val str: String = "疯狂" + "Java"
const val book: String = "疯狂Java讲义：" + 99.0
// 下面的book2常量的值因为使用了另一个常量，所以无法在编译时被确定下来
val d = 99.0
val book2: String = "疯狂Java讲义：" + d  //①
fun main(args: Array<String>) {
    println(book === "疯狂Java讲义：99.0")
}