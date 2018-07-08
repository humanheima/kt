

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
	// 把a当成一维数组进行初始化，初始化a是一个长度为4的数组
	// a数组的数组元素又是Array<Int>类型
	var a = arrayOfNulls<Array<Int>>(4)
	// 把a数组当成一维数组，遍历a数组的每个数组元素
	for (i in a.indices){
		println(a[i])
	}
	// 初始化a数组的第一个元素
	a[0] = arrayOf(2, 5)
	// 访问a数组的第一个元素所指数组的第二个元素
	a[0]?.set(1 , 6)
	// a数组的第一个元素是一个一维数组，遍历这个一维数组
	for (i in a[0]!!.indices ){
		println(a[0]?.get(i))
	}

	// 同时初始化二维数组的两个维数
	var b = Array<IntArray>(3, {IntArray(4, {0})})

	// 使用arrayOf来初始化一个二维数组
	var str1 =arrayOf(arrayOfNulls<String>(3) 
		, arrayOf("hello"))

}