

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
	// 创建不可变集合,返回值是Set
	var set = setOf("Java", "Kotlin", "Go")
	println(set) // 集合元素按添加顺序排列
	// 创建可变集合,返回值是MutableSet
	var mutableSet = mutableSetOf("Java", "Kotlin", "Go")
	println(mutableSet) // 集合元素按添加顺序排列
	println("setOf的返回对象的实际类型:${set.javaClass}")
	println("mutableSetOf的返回对象的实际类型:${mutableSet.javaClass}")
	// 创建HashSet集合
	var hashSet = hashSetOf("Java", "Kotlin", "Go")
	println(hashSet) // 不保证元素的顺序
	// 创建LinkedHashSet集合
	var linkedHashSet = linkedSetOf("Java", "Kotlin", "Go")
	println(linkedHashSet) // 集合元素按添加顺序排列
	// 创建TreeSet集合
	var treeSet = sortedSetOf("Java", "Kotlin", "Go")
	println(treeSet) // 集合元素由小到大排列
}