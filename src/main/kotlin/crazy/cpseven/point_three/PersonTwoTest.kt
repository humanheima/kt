

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
	var p = PersonTwo("李刚", 29)
	p.age = 120 // 赋值非法，不能赋值失败
	println(p.age) // 删除29
	p.age = 25 // 赋值合法，赋值成功
	println(p.age) // 输出25
}