

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
open class BaseClass{
	var name: String
	constructor(name: String){
		this.name = name
	}
}
// 子类没有显式声明构造器，
// 子类默认有一个主构造器，因此要在声明继承时委托调用父类的构造器
class SubClass1: BaseClass("foo"){
}
// 子类显式声明主构造器
// 主构造器必须在声明继承时委托调用父类的构造器
class SubClass2(name: String): BaseClass(name){
}