

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
// 定义一个函数
fun girth(width: Double , height: Double): Double{
	println("width: ${width}")
	println("height: ${height}")
	return 2 * (width + height)
}
fun main(args: Array<String>) {
	// 传统调用函数的方式，根据位置传入参数
	println(girth(3.5, 4.8))
	// 根据参数名来传入参数
	println(girth(width = 3.5, height = 4.8))
	// 根据名字传入参数时可交换位置
	println(girth(height = 4.8, width = 3.5))
	// 部分使用命名参数，部分使用位置参数
	println(girth(3.5, height = 4.8))
	// 位置参数必须放在命名参数之前，下面代码错误
//	println(girth(width = 3.5, 4.8))
}