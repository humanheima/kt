

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
	var s1 = "java"
	var s2 = "kotlin"
	// 下面两行代码是相同的
	println(s1 > s2) // 输出false
	println(s1.compareTo(s2) > 0) // 输出false
	var date1 = java.util.Date()
	var date2 = java.util.Date(System.currentTimeMillis() - 1000)
	println(date1 > date2) // 输出true
	println(date1.compareTo(date2) > 0) // 输出true
}
