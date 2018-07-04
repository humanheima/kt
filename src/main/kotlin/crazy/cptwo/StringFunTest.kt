

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
	val s1 = "2.34"
	// 将s1字符串转成Double
	val d: Double = s1.toDouble()
	println(d)
	var s2 = "45"
	// 将s2字符串转成Int
	var i: Int = s2.toInt()
	println(i)

	val str = "fkjava.org"
	println(str.capitalize()); // 首字母大写
	println(str.decapitalize()); // 首字母小写

	var str2 = "crazyit.org"
	// 返回两个字符串相同的前缀
	println(str2.commonPrefixWith("crazyjava.org"));
	// 返回两个字符串相同的后缀
	println(str2.commonSuffixWith("fkit.org"));

	var str3 = "java886"
	// 判断str3是否包含3个连续的数字
	println(str3.contains(Regex("\\d{3}")))
}