

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
// 为两个参数指定默认值
fun sayHi(name: String = "孙悟空", 
	message: String = "欢迎来到疯狂软件"){
	println("${name} , 您好")
	println("消息是：${message}")
}
fun main(args: Array<String>) {
	// 全部使用默认参数
	sayHi()
	// 只有message参数使用默认值
	sayHi("白骨精")
	// 两个参数都不使用默认值
	sayHi("白骨精", "欢迎学习Kotlin")
	// 只有name参数使用默认值
	sayHi(message = "欢迎学习Kotlin")

//sayHi(name="白骨精", "欢迎学习Kotlin")
//sayHi("欢迎学习Kotlin" , name="白骨精")

sayHi("白骨精", message="欢迎学习Kotlin")
sayHi(name="白骨精", message="欢迎学习Kotlin")

}
