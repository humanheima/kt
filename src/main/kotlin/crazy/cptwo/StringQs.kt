

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
	var str = "fkjava.org"
	println(str[2]) // 输出j
	println(str[3]) // 输出a
	println(str[6]) // 输出.
	// 遍历str字符串中每个字符
	for (c in str) {
		print("$c ")
	}
}