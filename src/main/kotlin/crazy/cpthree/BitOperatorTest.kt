

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
	println(5 and 9) // 将输出1
	println(5 or 9) // 将输出13

	println((-5).inv()) // 将输出4
	println(5 xor 9) // 将输出12

	println(5 shl 2) // 输出20
	println(-5 shl 2) // 输出-20

	// 输出-2
	println(-5 shr 2)
	// 输出1073741822
	println(-5 ushr 2)

}