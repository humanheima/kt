

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
fun test2(msg: String) {
	println("只有一个字符串参数的test()函数 ${msg}")
}
// 因为前面已经有了带一个字符串参数的test()函数
// 此处的个数可变形参又可以包含带一个字符串参数的形式
fun test2(vararg books: String) {
	println("****形参个数可变的test()函数**** ${books.contentToString()}")
}

fun main(args: Array<String>) {
	// 下面两次调用将执行第二个test()函数
	test2()
	test2("aa" , "bb")
	test2("aa")  // ①
}