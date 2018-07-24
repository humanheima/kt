

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
class PropertyDelegation{
	// 该属性的委托是MyDelegation对象
	var name: String by MyDelegation()
}
class MyDelegation{
	private var _backValue = "default value"
	operator fun getValue(thisRef: PropertyDelegation, property: KProperty<*>): String {
		println("${thisRef}的${property.name}属性执行getter方法")
		return _backValue
	}
	operator fun setValue(thisRef: PropertyDelegation, property: KProperty<*>, newValue: String) {
		println("${thisRef}的${property.name}属性执行setter方法" + 
			"，传入参数值为：${newValue}")
		_backValue = newValue
	}
}
fun main(args: Array<String>) {
	val pd = PropertyDelegation()
	// 读取属性，实际上是调用属性的委托对象的getter方法
	println(pd.name)
	// 写入属性，实际上是调用属性的委托对象的setter方法
	pd.name = "fkit.org"
	println(pd.name)
}
