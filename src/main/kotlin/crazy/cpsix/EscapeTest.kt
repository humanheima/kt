

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
// 定义一个List类型的变量，并将其初始化为空List
var lambdaList = java.util.ArrayList<(Int) -> Int>()
// 定义一个函数，该函数的形参类型为函数
fun collectFn(fn : (Int) -> Int ) {
	// 将传入的fn参数（函数或Lambda表达式）添加到lambdaList集合中
	// 这意味着fn将可以在collectFn范围之外使用
	lambdaList.add(fn)
}
fun main(args: Array<String>) {
	// 两次调用collectFn()函数，将会向lambdaList中添加元素（每个元素都是Lamda表达式）
	collectFn({it * it})
	collectFn({it * it * it})
	// 输出lambdaList的长度
	println(lambdaList.size)
	// 依次调用lambdaList集合的元素（每个元素都是Lamda表达式）
	for( i in lambdaList.indices ) {
		println( lambdaList[i](i + 10) )  // ①
	}
}