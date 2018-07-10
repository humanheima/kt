

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
	// 省略形参名，用it代表形参
	var square:(Int) -> Int = {it * it}
	// 使用square调用Lambda
	println(square(5))  // 输出25
	println(square(6))  // 输出36
	// Lambda表达式有两个形参，无法省略
	var result = {base: Int, exponent: Int ->
		var result = 1
		for ( i in 1 .. exponent) {
			result *= base
		}
		result
	}(4, 3)
	println(result)  // 输出64
	var list = listOf("Java", "Kotlin", "Go")
	// 省略形参名，用it代表形参
	var rt = list.dropWhile({it.length > 3})
	println(rt) // 输出[Go]
}