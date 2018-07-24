

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
class DiscernVariable{ // 隐式标签 @DiscernVariable
	private val prop = "out class variable"
	inner class InClass {  // 隐式标签 @InClass
		private val prop = "inner class variable"
		fun info(){
			val prop = "local variable"
			// 通过外部类类名.this.varName 访问外部类的属性
			println("外部类的属性值：${this@DiscernVariable.prop}")
			// 通过 this.varName 访问内部类的属性
			println("内部类的属性值：${this.prop}")
			// 直接访问局部变量
			println("局部变量的值：${prop}")
		}
	}
	fun test(){
		val ic = InClass()
		ic.info()
	}
}
fun main(args: Array<String>) {
	DiscernVariable().test()
}