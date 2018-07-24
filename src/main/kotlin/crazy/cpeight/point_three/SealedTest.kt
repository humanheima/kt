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
package crazy.cpeight.point_three

// 定义一个密封类，其实就是抽象类
sealed class Apple {
    abstract fun taste()
}

open class RedFuji : Apple() {
    override fun taste() {
        println("红富士香甜可口")
    }
}

data class Gala(var weight: Double) : Apple() {
    override fun taste() {
        println("嘎拉果更清脆,重量为：${weight}")
    }
}

fun main(args: Array<String>) {
    // 使用Apple声明变量，用子类实例赋值
    var ap1: Apple = RedFuji()
    var ap2: Apple = Gala(2.3)
    ap1.taste()
    ap2.taste()
}

fun judge(ap: Apple) {
    when (ap) {
        is RedFuji -> println("红富士")
        is Gala -> println("嘎拉果")
    }
}