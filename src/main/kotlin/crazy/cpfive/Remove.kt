

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
	var languages = mutableSetOf("Kotlin", "OC", "PHP", "Perl" , "Ruby" , "Go")
	// 删除"PHP"
	languages.remove("PHP")
	// 再次删除"Perl"
	languages.remove("Perl")
	println(languages)  // 输出[Kotlin, OC, Ruby, Go]
	// 批量删除多个元素
	languages.removeAll(setOf("Ruby", "Go"))
	println(languages)  // 输出[Kotlin, OC]
	// 清空Set集合
	languages.clear()
	println(languages.count())  // 输出0


var set = mutableSetOf("aa", "eyz" , "abc")
var it = set.iterator() // 返回MutableIterator
while(it.hasNext()){
	var e = it.next()
	println(e)
	// 遍历时删除元素
	if(e.length < 3) {
		it.remove()
	}
}
println(set) // 输出["eyz" , "abc"]
}