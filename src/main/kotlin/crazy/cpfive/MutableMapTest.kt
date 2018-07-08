

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
	var mutableMap = mutableMapOf("OC" to 96, "PHP" to 3400, 
		"Perl" to 4300 , "Ruby" to 5600 , "Go" to 5600)
	// 以方括号语法放入key-value对
	mutableMap["Swift"] = 9000
	// 用put方法放入key-value对
	mutableMap.put("OC" , 8600)
	// 下面输出{OC=8600, PHP=3400, Perl=4300, Ruby=5600, Go=5600, Swift=9000}
	println(mutableMap)
	// 删除key为"PHP"的key-value对
	mutableMap.remove("PHP")
	// 删除key为"Perl"的key-value对
	mutableMap.remove("Perl")
	// 下面输出：{OC=8600, Ruby=5600, Go=5600, Swift=9000}
	println(mutableMap)
	println(mutableMap.size)  // 输出4
	// 删除所有元素
	mutableMap.clear()
	println(mutableMap)  // 输出{}
	println(mutableMap.size)  // 输出0
}