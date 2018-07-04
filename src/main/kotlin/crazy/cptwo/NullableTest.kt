

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
	var str = "fkit"
	// 由于str转换为Int有可能失败，故num有可能没有值
	// 因此不能使用Int来声明num的类型
	//var num: Int = str.toIntOrNull()
	var num: Int? = str.toIntOrNull()
	println(num)

	var aStr: String = "fkit"
	var bStr: String? = "fkit"
//	aStr = null // 错误，aStr不接受null值
	bStr = null // 正确
	// 编译通过，aStr不可能为null，运行时不可能导致NPE
	println(aStr.length)
	// 编译不能通过，不可能导致NPE
	//println(bStr.length)
}