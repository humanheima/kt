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
    var list = listOf("Java", "Kotlin", "Go")
    // 最后一个参数是Lambda表达式，可将表达式写在括号外面
//	var rt = list.dropWhile(){it.length > 3}
    var rt = list.dropWhile { it.length > 3 }
    println(rt) // 输出[Go]
    var map = mutableMapOf("疯狂Android讲义" to 56)
    // 最后一个参数是Lambda表达式，可将表达式写在括号外面
    list.associateTo(map) { "疯狂${it}讲义" to it.length }
    // 输出{疯狂Android讲义=56, 疯狂Java讲义=4, 疯狂Kotlin讲义=6, 疯狂Go讲义=2}
    println(map)
    // 最后一个参数是Lambda表达式，可将表达式写在括号外面
//	var rtx = list.reduce(){acc , e -> acc + e}
    var rtx = list.reduce { acc, e -> acc + e }
    var rtx1 = list.reduce({ acc:String, e -> acc + e })
    println(rtx)
    println(rtx1)
}