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
    var bookPrice: Byte = 79
    var itemPrice: Short = 120
    // bookPrice是Byte类型，但变量a是Short类型，因此下面代码错误
//	var a: Short = bookPrice
    // 显式将bookPrice强制转换为Short类型
    var a: Short = bookPrice.toShort()  // ①
    var b: Byte = itemPrice.toByte()
    println("a: ${a}, b: ${b}")
    val amount = 233
    // 将Int型变量转换为Byte类型，发生溢出
    val byteAmount: Byte = amount.toByte() // ②
    println(byteAmount)

    // 算术表达式中bookPrice、itemPrice会自动提升为Int类型
    var total = bookPrice + itemPrice  // ③
    println("total的值为:${total}")
    // 可看到total映射的Java类型为int
    println("total的类型为:${total.javaClass}")
    // 下面表达式中bookPrice强制转换为Logn类型，因此整个表达式类型为Long
    val tot = bookPrice.toLong() + itemPrice.toByte()  // ④
    println("total的值为:${tot}")
    // 可看到total映射的Java类型为long
    println("total的类型为:${tot.javaClass}")
}