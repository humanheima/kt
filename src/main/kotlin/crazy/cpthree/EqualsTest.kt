

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
	var s1 = java.lang.String("java")
	var s2 = java.lang.String("java")
	println(s1 == s2);  // 输出true
	println(s1.equals(s2)); // 输出true
	println(s1 === s2); // 输出false
	println(s1 !== s2); // 输出true
}
