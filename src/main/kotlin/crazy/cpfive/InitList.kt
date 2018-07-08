

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
	// 创建不可变集合,返回值是List
	var list1 = listOf("Java", "Kotlin", null, "Go")
	println(list1) // 集合包含null
	// 创建不可变集合,返回值是List
	var list2 = listOfNotNull("Java", "Kotlin", null, "Go")
	println(list2) // 集合不包含null
	// 创建可变集合,返回值是MutableList
	var mutableList = mutableListOf("Java", "Kotlin", null, "Go")
	println(mutableList)
	println("listOf的返回对象的实际类型:${list1.javaClass}")
	println("listOfNotNull的返回对象的实际类型:${list2.javaClass}")
	println("mutableList的返回对象的实际类型:${mutableList.javaClass}")
	// 创建ArrayList集合
	var arrayList = arrayListOf("Java", "Kotlin", null, "Go")
	println(arrayList)
}
