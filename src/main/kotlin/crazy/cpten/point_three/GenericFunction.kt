

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
fun <T> copy(from: List<T>, to: MutableList<in T>){
	for(ele in from){
		to.add(ele)
	}
}
fun main(args: Array<String>) {
	var strList = listOf("Java", "Kotlin")
	var objList: MutableList<Any> = mutableListOf(2, 1.2, "Android")
	// 指定泛型函数的T为String类型
	copy<String>(strList , objList)  // ①
	println(objList)
	var intList = listOf(7, 13, 17, 19)
	// 不显式指定泛型函数的T的类型，系统推断T为Int类型
	copy(intList , objList)
	println(objList)
}