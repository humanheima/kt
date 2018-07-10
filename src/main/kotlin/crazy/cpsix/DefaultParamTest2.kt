

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
// 定义一个打印三角形的函数，只为第一个参数指定默认值
fun printTriangle(height: Int = 5, char: Char){
	for (i in 1..height) {
		// 先打印一排空格
		for (j in 0 until height - i) {
			print(" ");
		}
		// 再打印一排特殊字符
		for (j in 0 until 2 * i - 1) {
			print(char);
		}
		println()
	}
}
fun main(args: Array<String>) {
	printTriangle(char = '*')
	printTriangle(6, '@')
	printTriangle(7, char = '#')

	// 下面代码是错误的
//	printTriangle('#')
}
