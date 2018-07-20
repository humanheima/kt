

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
class ConstructorOverload{
	var name: String?
	var count: Int
	init{
		println("初始化块！")
	}
	// 提供无参数的构造器
	constructor(){
		name = null
		count = 0
	}
	constructor(name:String, count:Int){
		this.name = name
		this.count = count
	}
}
fun main(args: Array<String>) {
	// 通过无参数构造器创建ConstructorOverload对象
	var oc1 = ConstructorOverload()
	// 通过有参数构造器创建ConstructorOverload对象
	var oc2 = ConstructorOverload(
		"kotlin", 300000)
	println("${oc1.name} ${oc1.count}")
	println("${oc2.name} ${oc2.count}")
}