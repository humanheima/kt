

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
	var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(map) // key-value对按添加顺序排列
	// 创建可变集合,返回值是MutableMap
	var mutableMap = mutableMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(mutableMap) // key-value对按添加顺序排列
	println("mapOf的返回对象的实际类型:${map.javaClass}")
	println("mutableMapOf的返回对象的实际类型:${mutableMap.javaClass}")
	// 创建HashMap集合
	var hashMap = hashMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(hashMap) // 不保证key-value对的顺序
	// 创建LinkedHashMap集合
	var linkedHashMap = linkedMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(linkedHashMap) // key-value对按添加顺序排列
	// 创建TreeMap集合
	var treeMap = sortedMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(treeMap) // key-value对按key由小到大排列
}