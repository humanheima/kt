

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
import kotlin.reflect.full.*
class Foo{
	fun test(msg: String){
		println("执行带String参数的test方法：${msg}")
	}
	fun test(msg: String, price: Double){
		println("执行带String, Double参数的test方法：${msg}, ${price}")
	}
}
fun main(args: Array<String>) {
	val clazz = Foo::class
	// 创建Foo类的实例
	val ins = clazz.createInstance()
	// 获取clazz所代表类直接定义的全部函数
	val funs = clazz.declaredFunctions
	for (f in funs) {
		// 如果函数具有3个参数（对应2个参数的方法）
		if (f.parameters.size == 3) {
			// 调用带3个参数的函数
			f.call(ins, "Kotlin", 78.8)
		}
		// 如果函数具有2个参数（对应1个参数的方法）
		if (f.parameters.size == 2) {
			// 调用带2个参数的函数
			f.call(ins, "Kotlin")
		}
	}
}
