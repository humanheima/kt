

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
	var a = 20;
	// 用运算符
	val b = -a;
	// 调用方法
	val c = a.unaryMinus();
	println("b: ${b}, c: ${c}");
	val flag = true
	// 用运算符
	val notFlag1 = !flag
	// 调用方法
	val notFlag2 = flag.not()
	println("notFlag1: ${notFlag1}, notFlag2: ${notFlag2}");
}
