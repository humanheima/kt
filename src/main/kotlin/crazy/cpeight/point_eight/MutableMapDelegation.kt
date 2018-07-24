

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
class MutableItem(val map: MutableMap<String, Any?>) {
	var barCode: String by map
	var name: String by map
	var price: Double by map
}
fun main(args: Array<String>) {
	val item = MutableItem(mutableMapOf(
	))
	// 设置item对象的属性，其实会委托给MutableMap处理
	item.barCode = "133333"
	item.name = "疯狂Kotlin讲义"
	item.price = 69.8
	println("---------------")
	// 将对象持有的map暴露出来，其他程序可通过标准Map读取数据
	val map = item.map
	println(map["barCode"])  // 输出133333
	println(map["name"])  // 输出疯狂Kotlin讲义
	println(map["price"])  // 输出69.8
	map["price"] = 78.8
	println(item.price)  // 输出78.8
}