

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
	// 定义普通字符串
	var str = "fkjava.org"
	println(str.length)
	// 定义原始字符串
	val txt = """
		|天上白玉京，
		|十二楼五城。
		|仙人抚我顶，
		|结发受长生。
	""".trimMargin()
	println(txt)
	// 定义原始字符串
	val txt2 = """
		^天上白玉京，
		^十二楼五城。
		^仙人抚我顶，
		^结发受长生。
	""".trimMargin("^")
	println(txt2)
}