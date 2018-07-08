

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
import java.util.Arrays
fun main(args: Array<String>) {
	// 创建包含指定元素的数组（相当于Java数组的静态初始化）
	var intArr = intArrayOf(2, 4, 30, -5)
	var doubleArr = doubleArrayOf(2.3, 3.5, -3.0)
	// 创建指定长度、使用Lambda表达式初始化数组元素的数组
	var intArr2 = IntArray(5, {it * it})
	var charArr = CharArray(5, {(it * 2 + 97).toChar()})
	println(Arrays.toString(intArr2))
	println(Arrays.toString(charArr))
}