

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
	// 创建可变集合,返回值是List
	var mutableList = mutableListOf("Kotlin", null, "Go")
	// 在索引为2处插入一个新元素
	mutableList.add(2, "Java")
	println(mutableList) // [Kotlin, null, Java, Go]
	// 删除索引1处的元素
	mutableList.removeAt(1)
	println(mutableList) // [Kotlin, Java, Go]
	// 将索引1处的元素替换为"Lua"
	mutableList[1] = "Lua"
	println(mutableList) // [Kotlin, Lua, Go]
	// 清空List集合的所有元素
	mutableList.clear();
	println(mutableList.size) // 0
}
