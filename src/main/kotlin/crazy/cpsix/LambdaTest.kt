

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
fun getMathFuncLambda(type: String) : (Int) -> Int {
	// 该函数返回的是Lambda表达式
	when(type) {
		"square" -> return {n: Int ->  // ①
				n * n
			}
		"cube" -> return {n: Int ->  // ②
				n * n * n
			}
		else -> return {n: Int ->  // ③
				var result = 1
				for ( index in 2..n ){
					result *= index
				}
				result
			}
	}
}
fun main(args: Array<String>) {
	// 调用getMathFunc()，程序返回一个(Int)->Int类型的函数
	var mathFunc = getMathFuncLambda("cube") // 得到cube函数
	println(mathFunc(5)) // 输出125
	mathFunc = getMathFuncLambda("square") // 得到square函数
	println(mathFunc(5)) // 输出25
	mathFunc = getMathFuncLambda("other") // 得到factorial函数
	println(mathFunc(5)) // 输出120
}