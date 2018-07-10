

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
// 定义一个函数，该函数返回值类型为() -> List<String>
fun makeList(ele:String): () -> List<String> {
	// 创建一个不包含任何元素的List
	var list: MutableList<String> = mutableListOf()
	fun addElement() : List<String> {
		// 向list集合中添加一个元素
		list.add(ele)
		return list
	}
	return ::addElement
}
fun main(args: Array<String>){
	println("-----add1返回的List------")
	// add1将会持有list的副本
	val add1 = makeList("孙悟空")  // ①
	println(add1())
	println(add1())
	println("-----add2返回的List------")
	// add2将会持有list的副本，与add1的list副本没有关系
	val add2 = makeList("猪八戒")  // ②
	println(add2())
	println(add2())
}