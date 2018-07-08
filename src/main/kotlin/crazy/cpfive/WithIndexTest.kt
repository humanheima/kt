

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
	var books = arrayOf("轻量级Java EE企业应用实战" , 
		"疯狂Java讲义",
		"疯狂Android讲义")
	// 通过withIndex()方法可同时访问数组的索引和元素
	for((index, value) in books.withIndex()){
		println("索引为${index}的元素是：${value}")
	}
}
