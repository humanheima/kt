

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
class ReturnThis {
	var age = 0
	fun grow(): ReturnThis{
		age++
		// return this返回调用该方法的对象
		return this
	}
}
fun main(args: Array<String>) {
	val rt = ReturnThis()
	// 可以连续调用同一个方法
	rt.grow()
		.grow()
		.grow()
	println("rt的age属性值是:" + rt.age)
}