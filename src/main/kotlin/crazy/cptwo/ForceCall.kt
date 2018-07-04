

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
	var b: String? = "fkit"
	println(b!!.length) // 输出4
	b = null
	println(b!!.length) // 输出null

	// 定义一个元素可空的数组
	val myArr: Array<String?> = arrayOf("fkit", "fkjava", null, "crazyit")
	for (item in myArr) {
		// 当item不为null时才调用let函数
		item!!.let { println(it) }
	}
}