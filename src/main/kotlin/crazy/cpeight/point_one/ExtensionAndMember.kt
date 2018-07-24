

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
class ExtensionAndMember {
	// 为该类定义成员方法：foo()
	fun foo() = println("member method")
}
// 为ExtensionAndMember类定义扩展方法：foo()
fun ExtensionAndMember.foo() = println("extension method")
fun main(args: Array<String>){
	var ea = ExtensionAndMember()
	// ea调用foo()方法，优先使用成员方法
	ea.foo() // 输出"成员方法"
}

fun ExtensionAndMember.foo(name: String) = println("扩展方法,参数:${name}")
fun ExtensionAndMember.foo(age: Int) = println("扩展方法,参数:${age}")
 