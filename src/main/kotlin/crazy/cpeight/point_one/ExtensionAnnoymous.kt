

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
// 定义一个带接收者的匿名函数
val factorial: Int.()->Int = fun Int.(): Int{
	// 该匿名函数的接收者是Int对象，
	// 因此该匿名函数中this代表了调用该匿名函数的Int对象
	if (this < 0) {
		return -1
	} else if(this == 1){
		return 1
	} else {
		var result = 1
		for (i in 1 .. this ) {
			result *= i
		}
		return result
	}
}
fun main(args: Array<String>) {
	println(6.factorial())
}