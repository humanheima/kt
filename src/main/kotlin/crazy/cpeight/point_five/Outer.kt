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
package crazy.chpeight.point_five

class Outer {
    private val outProp = 9

    inner class Inner {
        val inProp = 5
        fun acessOuterProp() {
            // 内部类可以直接访问外部类的private属性
            println("外部类的outProp值:${outProp}")
        }
    }

    fun accessInnerProp() {
        // 外部类不能直接访问内部类的属性
        // 下面代码出现编译错误
//		println("内部类的inProp值:${inProp}")
        // 如需访问内部类的属性，必须显式创建内部类对象
        println("内部类的inProp值: ${Inner().inProp}")
    }
}

fun main(args: Array<String>) {
    // 执行下面代码，只创建了外部类对象，还未创建内部类对象
    val ot = Outer()  // ①
    ot.accessInnerProp()
}