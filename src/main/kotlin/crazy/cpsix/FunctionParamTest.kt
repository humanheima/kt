

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
// 定义函数类型的形参，其中fn是(Int) -> Int类型的形参
fun map(data : Array<Int>,  fn: (Int) -> Int) : Array<Int> {
	var result = Array<Int>(data.size, {0})
	// 遍历data数组中每个元素，并用fn函数对data[i]进行计算
	// 然后将计算结果作为新数组的元素
	for (i in data.indices) {
		result[i] = fn(data[i])
	}
	return result
}
// 定义一个计算平方的函数
fun square(n: Int) : Int {
	return n * n
}
// 定义一个计算立方的函数
fun cube(n: Int) : Int {
	return n * n * n
}
// 定义一个计算阶乘的函数
fun factorial(n: Int) : Int {
	var result = 1
	for (index in 2 .. n) {
		result *= index
	}
	return result
}
fun main(args: Array<String>) {
	var data = arrayOf(3 , 4 , 9 , 5, 8)
	println("原数据${data.contentToString()}")
	// 下面程序代码3次调用map()函数，每次调用时传入不同的函数
	println("计算数组元素的平方")
	println(map(data , ::square).contentToString())
	println("计算数组元素的立方")
	println(map(data , ::cube).contentToString())
	println("计算数组元素的阶乘")
	println(map(data , ::factorial).contentToString())
}