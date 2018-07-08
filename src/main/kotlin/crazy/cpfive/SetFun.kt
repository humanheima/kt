

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
	// 创建不可变集合,返回值是Set
	var set = setOf("Java", "Kotlin", "Go")
	// 判断是否所有元素的长度大于4
	println(set.all({it.length > 4})) // 输出false
	// 判断是否任一元素的长度大于4
	println(set.any({it.length > 4})) // 输出true
	// 以lambda表达式的值为key，集合元素为value，组成Map集合
	val map = set.associateBy({"《疯狂" + it + "讲义》"})
	// 输出：{《疯狂Java讲义》=Java, 《疯狂Kotlin讲义》=Kotlin, 《疯狂Go讲义》=Go}
	println(map)


	// 由于有contains()方法，所以可用in、!in运算符
	println("Java" in set) // 输出true
	println("Go" !in set) // 输出false

	// 返回删除Set集合前面2个元素后的集合
	val dropedList = set.drop(2)
	println(dropedList) // 输出[Go]

		
	// 对Set集合元素进行过滤：要求集合元素包含li
	val filteredList = set.filter({"li" in it})
	println(filteredList) // 输出[Kotlin]
	
	// 查找Set集合元素中包含li的元素，如果找到就返回该元素，否则返回null
	val foundStr1 = set.find({"li" in it})
	println(foundStr1) // 输出Kotlin
	// 查找Set集合元素中包含gang的元素，如果找到就返回该元素，否则返回null
	val foundStr2 = set.find({"gang" in it})
	println(foundStr2) // 输出null
	// 将Set集合中所有字符串拼接在一起
	val foldedList = set.fold("", {acc, e -> acc + e})
	println(foldedList) // 输出JavaKotlinGo

	// 查找某个元素的出现位置
	println(set.indexOf("Go")) // 输出2

	// 将每个集合元素映射成新值，返回所有新值组成的List集合
	val mappedList = set.map({"《疯狂" + it + "讲义》"})
	// 输出：[《疯狂Java讲义》, 《疯狂Kotlin讲义》, 《疯狂Go讲义》]
	println(mappedList)

	// 获取最大值
	println(set.max()) // 输出Kotlin
	// 获取最小值
	println(set.min()) // 输出Go
	// 反转集合顺序
	val reversedList = set.reversed()
	println(reversedList) // 输出[Go, Kotlin, Java]

	var bSet = setOf("Lua", "Erlang", "Kotlin")
	// 计算两个集合的交集
	println(set intersect bSet) // 输出[Kotlin]
	// 计算两个集合的并集
	println(set union bSet) // 输出[Java, Kotlin, Go, Lua, Erlang]
	// 集合相加、相当于并集
	println(set + bSet) // 输出[Java, Kotlin, Go, Lua, Erlang]
	// 集合相减、减去它们公共的元素
	println(set - bSet) // 输出[Java,  Go]
}