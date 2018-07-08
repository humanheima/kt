

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
fun main(args: Array<String>) {
	// 创建不可变集合,返回值是Map
	var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 76)
	// 遍历Map的key-value对，entris元素返回key-value对组成的Set
	for (en in map.entries) {
		println("${en.key} -> ${en.value}")
	}
	// 先遍历Map的key对，再通过key获取value
	for (key in map.keys ) {
		println("${key} -> ${map[key]}")
	}
	// 直接用for-in循环遍历Map
	for( (key,value) in map){
		println("${key} -> ${value}")
	}
	// 用lambda表达式遍历Map
	map.forEach({println("${it.key} -> ${it.value}")})
}