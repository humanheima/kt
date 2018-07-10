

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

// 定义了形参个数可变的函数
fun test(vararg books : String , num: Int) {
    // books被当成数组处理
    for (i in books.indices) {
        println(books[i])
    }
    println(num)
}
fun main(args: Array<String>) {
	// 调用test()函数
	test("疯狂iOS讲义", "疯狂Android讲义", num = 20)
	var arr = arrayOf("疯狂Kotlin讲义", "疯狂Java讲义")
	// 将数组的多个元素传给个数可变的参数
	test(*arr, num = 20)
}