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
    val bookPrice = 79
    // 字符串模板中嵌入变量
    var s = "图书价格是：${bookPrice}"
    println(s)
    val rand = java.util.Random() // 创建Java的Random对象
    // 字符串模板中嵌入方法调用
    var s2 = "伪随机数是：${rand.nextInt(10)}"
    println(s2)
    val myStr = "fkjava.org"
    println("${myStr}的长度是${myStr.length}")
    var bookName = "疯狂Kotlin讲义"
    val poem = """
		|图书名是${bookName},
		|图书价格是${bookPrice},
		|随机促销价是${rand.nextInt(10) + 50}
	""".trimMargin()
    println(poem)
}
