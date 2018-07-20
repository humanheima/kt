

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
class BackingProperty(name: String){
	// 定义private修饰的属性，该属性是幕后使用
	private var _name: String = name
	var name 
		// 重写getter方法，返回幕后属性的值
		get() = _name
		set(newName){
			// 执行合理性校验，要求用户名必须在2~6位之间
			if (newName.length > 6 || newName.length < 2){
				println("invalid")
			} else {
				// 对幕后属性赋值
				_name = newName
			}
		}
}
fun main(args: Array<String>) {
	var p = BackingProperty("ligang")
	// 访问p.name，实际上会转为访问幕后属性_name
	println(p.name)
	// 对p.name赋值，实际上会转为对幕后属性_name赋值
	p.name = "sunwukong"
	println(p.name)
}