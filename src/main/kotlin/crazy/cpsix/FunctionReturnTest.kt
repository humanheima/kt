

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
// 定义函数，该函数的返回值类型为(Int) -> Int
fun getMathFunc(type: String): (Int) -> Int {
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
		// 返回局部函数
		"square" -> return ::square
		"cube" -> return ::cube
		else -> return ::factorial
	}
}
fun main(args: Array<String>) {
	// 调用getMathFunc()，程序返回一个(Int)->Int类型的函数
	var mathFunc = getMathFunc("cube") // 得到cube函数
	println(mathFunc(5)) // 输出125
	mathFunc = getMathFunc("square") // 得到square函数
	println(mathFunc(5)) // 输出25
	mathFunc = getMathFunc("other") // 得到factorial函数
	println(mathFunc(5)) // 输出120
}