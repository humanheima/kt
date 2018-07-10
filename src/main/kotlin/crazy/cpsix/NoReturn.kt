

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
// 定义一个函数，该函数既无形参，也无返回值
fun foo() {
	println("程序执行foo()函数")
}
// 定义一个函数，该函数没有返回值，但函数有1个形参
fun sayHiNoReturn(name: String) : Unit {
	println("====程序执行sayHi()函数====")
	println("${name}，你好。欢迎光临")
}
// 定义一个函数，该函数没有返回值，但函数有2个形参
fun showMsg(msg: String , count :Int) {
	for( i in 1 .. count) {
		println(msg)
	}
}
fun main(args: Array<String>) {
	foo()
	sayHiNoReturn("孙悟空")
	showMsg("欢迎学习Kotlin" , 3)
}
