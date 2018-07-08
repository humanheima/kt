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
    var books = arrayOf("轻量级Java EE企业应用实战",
            "疯狂Java讲义",
            "疯狂Android讲义")
    // 使用for-in循环来遍历数组元素
    // 其中book将会自动迭代每个数组元素
    for (book in books) {
        println(book)
    }
    var i = java.util.Random().nextInt(10)
    // 检查i是否位于books数组的索引区间内
    println(i in books.indices) // i >=0 && i < books.size
    println(books.lastIndex) // 输出2
    println(books.size - 1 == books.lastIndex) // 输出true

    println("----------------------------")

    var bookSet = setOf("轻量级Java EE企业应用实战",
            "疯狂Java讲义",
            "疯狂Android讲义")
    for (book in bookSet) {
        println(book)
    }

    bookSet.forEach({ println(it) })

    for (i in bookSet.indices) {
        println(bookSet.elementAt(i))
    }
}
