

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

fun main(args: Array<String>) {
	var str = "fkjava.org"
	// 根据get方法获取指定索引的字符
	println(str.get(2))
	// 使用索引运算符来获取指定索引的字符
	println(str[2])
	// 创建Java的ArrayList集合
	var list = java.util.ArrayList<String>()
	list.add("Java")
	list.add("Kotlin")
	list.add("Go")
	// 使用索引运算符来获取指定索引的List集合元素
	println(list[1])
	// 使用索引运算符来修改指定索引的List集合元素
	list[2] = "Swift"
	println(list)
}

