

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
fun fn(n:Int) : Int {
	if (n == 0) {
		return 1
	}
	else if (n == 1) {
		return 4
	}
	else {
		// 函数中调用它自身，就是函数递归
		return 2 * fn(n - 1) + fn(n - 2)
	}
}
fun main(args: Array<String>) {
	// 输出fn(10)的结果
	println("fn(10)的结果是:${fn(10)}")
}


