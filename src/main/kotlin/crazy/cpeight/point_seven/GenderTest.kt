

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
fun main(args: Array<String>) {
	// 通过Gender的valueOf()方法根据枚举名获取枚举值
	val g = Gender.valueOf("FEMALE")
	// 访问枚举值的cnName属性
	println("${g} stand ${g.cnName}")
	// 调用info方法
	g.info()
}