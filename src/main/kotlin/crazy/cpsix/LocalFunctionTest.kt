

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
// 定义函数，该函数的返回值类型为Int
fun getMathFunc(type: String , nn: Int) : Int {
	// 定义一个计算平方的局部函数
	fun square(n: Int) : Int {  // ①
		return n * n
	}
	// 定义一个计算立方的局部函数
	fun cube(n: Int) : Int {  // ②
		return n * n * n
	}
	// 定义一个计算阶乘的局部函数
	fun factorial(n: Int) : Int {  // ③
		var result = 1
		for (index in 2 .. n) {
			result *= index
		}
		return result
	}
	when(type) {
		// 调用局部函数
		"square" -> return square(nn)
		"cube" -> return cube(nn)
		else -> return factorial(nn)
	}
}
fun main(args: Array<String>) {
	println(getMathFunc("square", 3)) // 输出9
	println(getMathFunc("cube", 3)) // 输出27
	println(getMathFunc("", 3)) // 输出6
}