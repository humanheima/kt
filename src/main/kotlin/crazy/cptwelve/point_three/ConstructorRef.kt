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
package crazy.cptwelve.point_three

class Foo(var name: String = "未知")

// test函数的参数是(String)->Foo类型（这就是Foo带String参数构造器的类型）
fun test(factory: (String) -> Foo) {
    val x: Foo = factory("疯狂Kotlin讲义")
    println(x.name)
}

fun main(args: Array<String>) {
    // 通过::Foo引用Foo类的主构造器
    //要是给Foo换一个参数怎么实现？
    test(::Foo)
}