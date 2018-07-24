

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
import kotlin.reflect.*;
import kotlin.properties.*;
class MyTarget{
	// 该属性的委托是MPropertyChecker对象
	var name: String by PropertyChecker()
}
class PropertyChecker() {
	operator fun provideDelegate(thisRef: MyTarget,
		prop: KProperty<*>): ReadWriteProperty<MyTarget, String> {
		// 插入自定义代码，可执行任意业务操作
		checkProperty(thisRef, prop.name)
		// 返回实际的委托对象
		return MyDelegation1()
	}
	private fun checkProperty(thisRef: MyTarget, name: String) {
		println(" ----- 检查属性  ----");
	}
}
class MyDelegation1: ReadWriteProperty<MyTarget, String>{
	private var _backValue = "default value"
	override operator fun getValue(thisRef: MyTarget, property: KProperty<*>): String {
		println("${thisRef}的${property.name}属性执行getter方法")
		return _backValue
	}
	override operator fun setValue(thisRef: MyTarget, property: KProperty<*>, value: String) {
		println("${thisRef}的${property.name}属性执行setter方法" + 
			"，传入参数值为：${value}")
		_backValue = value
	}
}

fun main(args: Array<String>) {
	// 创建对象（初始化属性），调用委托工厂的provideDelegate()方法
	val pd = MyTarget()
	// 读取属性，实际上是调用属性的委托对象的getter()方法
	println(pd.name)
	// 写入属性，实际上是调用属性的委托对象的setter()方法
	pd.name = "fkit.org"
	println(pd.name)
}
