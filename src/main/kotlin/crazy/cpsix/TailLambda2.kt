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
fun <T> test(vararg names: String, transform: (String) -> T): List<T> {
    var mutableList: MutableList<T> = mutableListOf();
    for (name in names) {
        mutableList.add(transform(name))
    }
    return mutableList.toList()
}

fun main(args: Array<String>) {
    // 将Lambda表达式放在括号后面，无需使用命名参数
    var list1 = test("Java", "Kotlin", "Go", transform = { it: String -> it.length })
    var list11 = test("Java", "Kotlin", "Go") {it.length }
    println(list1)
    // 将Lambda表达式放在括号后面，无需使用命名参数
    var list2 = test("Java", "Kotlin", "Go") { "疯狂${it}讲义" }
    println(list2)
}