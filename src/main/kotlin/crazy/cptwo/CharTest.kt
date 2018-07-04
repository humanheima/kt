

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
	// 直接指定单个字符作为字符值
	val aChar: Char = 'a'
	// 使用转义字符来作为字符值
	val enterChar: Char = '\r'
	// 使用Unicode编码值来指定字符值
	val ch: Char = '\u9999'
	// 将输出一个'香'字符
	println(ch)
	// 定义一个'疯'字符值
	var zhong: Char = '疯'
	// 将char变量当成Int型处理会报错。
//	var zhongValue: Int = zhong
}