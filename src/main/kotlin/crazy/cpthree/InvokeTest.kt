

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

fun main(args: Array<String>) {
	val s = "java.lang.String"
	// 使用反射获取String类的length()方法
	val mtd = Class.forName(s).getMethod("length")
	// 使用传统方法，使用Method对象的invoke()方法
	println(mtd.invoke("java"))
	// 使用调用运算符
	println(mtd("java"))
}
