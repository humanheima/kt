

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
// 定义函数类型的形参，其中fn是(Int) -> Unit类型的形参
inline fun each(data : Array<Int>, fn: (Int)->Unit) {
	for (el in data) {
		fn(el)
	}
}
fun main(args: Array<String>) {
	var arr = arrayOf(20, 4, 40, 100, 30)
	each(arr, {
		println(it)
		return // 如果each函数没有inline修饰，此处编译错误；
		// 如果each函数有inline修饰，此处的return将返回main方法
	})
}