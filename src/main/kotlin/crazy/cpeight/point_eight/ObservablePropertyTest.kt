

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
import kotlin.properties.*;
var observableProp: String by Delegates.observable("default value") {
		// Lambda表达式的第一个参数代表被监听的属性
		// 第二个参数代表修改之前值
		// 第三个参数代表被设置的新值
        prop, old, new ->
        println("${prop} 的 ${old} 被改为 ${new} ")
    }
fun main(args: Array<String>) {
	// 访问observableProp属性，不会触发监听器的Lambda表达式
	println(observableProp)
	// 设置属性值，触发监听器的Lambda表达式
	observableProp = "crazy software"
	println(observableProp)
}