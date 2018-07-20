

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
package crazy.cpseven.point_five

class Person(name: String){
	// 下面定义一个初始化块
	init{
		var a = 6
		if (a > 4){
			println("Person初始化块：局部变量a的值大于4")
		}
		println("Person的初始化块")
		println("name参数为：${name}")
	}
	// 定义第二个初始化块
	init{
		println("Person的第二个初始化块")
	}
}
fun main(args: Array<String>){
	Person("sunwukong")
}