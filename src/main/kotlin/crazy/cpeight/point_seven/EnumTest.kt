

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
package crazy.cpeight.point_seven

fun main(args: Array<String>) {
	// 枚举类默认有一个values()方法，返回该枚举类的所有实例
	for (s in Season.values()){
		println(s)
	}
	val seasonName = "SUMMER"
	val s: Season = Season.valueOf(seasonName)
	println(s)
	// 直接访问枚举值
	println(Season.WINTER)

	printAllValues<Season>() // 输出 SPRING, SUMMER, FALL, WINTER
}
inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString { it.name })
}
