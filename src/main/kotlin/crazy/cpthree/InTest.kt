

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

fun main(args: Array<String>) {
	var str = "fkjava.org"
	// 调用String的contains方法判断
	println( str.contains("java") )
	// 使用in运算符判断
	println("java" in str)
	val array = arrayOf(24, 45, 100, -3, 30)
	// 调用Array的contains方法判断
	println(array.contains(100))
	// 使用in运算符判断
	println(100 in array)
}

