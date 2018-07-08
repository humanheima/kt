import java.util.*

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
    // 创建包含指定元素的数组（相当于Java数组的静态初始化）
    var arr1 = arrayOf("Java", "Kotlin", "Swift", "Go")
    var intArr1 = arrayOf<Int>(2, 4, 500, -34)
    // 创建指定长度、元素为null的数组（相当于Java数组的动态初始化）
    var arr2 = arrayOfNulls<Double>(5)
    var intArr2 = arrayOfNulls<Int>(6)
    // 创建长度为0的空数组
    var arr3 = emptyArray<String>()
    var intArr3 = emptyArray<Int>()
    // 创建指定长度、使用Lambda表达式初始化数组元素的数组
    var arr4 = Array<Char>(5, { (it * 2 + 97).toChar() })
    var strArr4 = Array(6, { "fkit" })
    for (i in arr4) {
        print(i)
    }
    println(Arrays.toString(arr4))
    for (i in 0 until strArr4.size) {
        print(strArr4[i])
    }
}