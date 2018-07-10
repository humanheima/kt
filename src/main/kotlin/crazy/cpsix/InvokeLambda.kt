

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
	// 定义一个Lambda表达式，并将它赋值给square变量
	var square = {n: Int ->
		n * n
	}
	// 使用square调用Lambda表达式
	println(square(5))  // 输出25
	println(square(6))  // 输出36
	// 定义Lambda表达式，并在它后面增加圆括号来调用该Lambda表达式
	var result = {base: Int , exponent:Int ->
		var result = 1
		for (i in 1 .. exponent) {
			result *= base
		}
		result
	}(4, 3)
	println(result)  // 输出64
}