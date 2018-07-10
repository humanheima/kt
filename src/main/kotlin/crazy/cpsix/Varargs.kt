

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
// 定义了形参个数可变的函数
fun test(a : Int , vararg books : String) {
    // books被当成数组处理
    for( b in books) {
        println(b)
    }
    // 输出整数变量a的值
    println(a)
}
fun main(args: Array<String>) {
	// 调用test()函数
	test(5 , "疯狂iOS讲义" , "疯狂Android讲义")
}