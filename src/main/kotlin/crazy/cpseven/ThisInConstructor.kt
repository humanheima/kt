

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
class ThisInConstructor{
	// 定义一个名为foo的属性
	var foo: Int
	constructor(){
		// 在构造器里定义一个foo变量
		val foo = 0
		// 使用this代表该构造器正在初始化的对象
		// 下面的代码将会把该构造器正在初始化的对象的foo属性设为6
		this.foo = 6
	}
}
fun main(args: Array<String>){
	// 所有使用ThisInConstructor创建的对象的foo属性将被设为6
	println(ThisInConstructor().foo) // 输出6
}
