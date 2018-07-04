

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
	var a = 20
	println("a: ${a++}")  // 输出20
	// 以下代码大致相当于a++
	a = a.inc()
	println("a: ${a}")  // 输出22

	var b=20;
    println("b: ${++b}")//输出21
}

