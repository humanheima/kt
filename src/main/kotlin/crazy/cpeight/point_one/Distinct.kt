

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
class Tiger{
	fun foo(){
		println("Tiger类的foo()方法")
	}
}
class Bear{
	fun foo(){
		println("Bear类的foo()方法")
	}
	// 以成员方式为Tiger类扩展test()方法
	fun Tiger.test(){
		foo()
		// 使用带标签的this指定调用Bear的foo()方法
		this@Bear.foo()
	}
	fun info(tiger: Tiger){
		tiger.test()
	}
}
fun main(args: Array<String>) {
	val b = Bear()
	b.info(Tiger())
}