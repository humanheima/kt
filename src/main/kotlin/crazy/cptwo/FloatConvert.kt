

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
	var width: Float = 2.3f
	var height: Double = 4.5
	// width必须显式强制转换为Double之后，才能赋值给变量a
	var a: Double = width.toDouble()
	println("a的值为: ${a}")
	// 将height强制转换为Float之后再进行计算，整个表达式的类型都是Float类型
	// 因此area1的类型也被推断为Float类型
	var area1 = width * height.toFloat()
	// 表达式中height是Double类型，它是等级最高的运算数
	// 因此整个表达式的类型都是Double类型，area2的类型也被推断为Double类型
	var area2 = width * height
	val multi: Int = 5
	// 因此totalHeight1的类型也被推断为Double类型
	var totalHeight1 = height * multi  // ①
	// 将height强制转换为Int后进行计算，整个表达式的类型都是Int类型
	// 因此totalHeight2的类型也被推断为Int类型
	var totalHeight2 = height.toInt() * multi  // ②
	println(totalHeight2)
}