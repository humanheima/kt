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
interface OutputableAnother {
    fun output(msg: String)
}

class MyClassAnother {
    // 省略名字的伴生对象
    companion object : Outputable {
        // 重写父接口中的抽象方法
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h${i}>${msg}</h${i}>")
            }
        }
    }
}

fun MyClassAnother.Companion.test() {
    println("extension method")
}

val MyClassAnother.Companion.foo
    get() = "extension field"

fun main(args: Array<String>) {
    // 使用伴生对象所在的类调用伴生对象的方法
    MyClass.output("fkit.org")
    MyClassAnother.test()
    println(MyClassAnother.foo)
}