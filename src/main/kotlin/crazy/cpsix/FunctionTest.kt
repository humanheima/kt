

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
// 定义一个函数，声明2个形参，返回值为Int类型
fun max(x:Int , y:Int): Int {
	// 定义一个常量z，该常量等于x、y中较大的值
	val z = if (x > y) x else y
	// 返回常量z的值
	return z
}
// 定义一个函数，声明一个形参，返回值为String类型
fun sayHi(name: String) : String {
	println("===正在执行sayHi()函数===")
	return "${name}，您好！"
}
fun main(args: Array<String>){
	var a = 6
	var b = 9
	// 调用max()函数，将函数返回值赋值给result变量
	var result = max(a , b)  // ①
	println("result:${result}")
	// 调用sayHi()函数，直接输出函数的返回值
	println(sayHi("孙悟空"))  // ②
}
