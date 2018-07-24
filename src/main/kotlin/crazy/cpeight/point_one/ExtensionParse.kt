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
package crazy.cpeight.point_one

// 定义一个Base类
open class Base

// 定义Sub类继承Base类
class Sub : Base()

// 为Base类扩展foo方法
fun Base.foo() = println("Base foo()")

// 为Sub类扩展foo方法
fun Sub.foo() = println("Sub foo()")

// 定义一个函数
fun invokeFoo(b: Base) {
    // 调用Base对象的foo()方法
    b.foo()
}

fun main(args: Array<String>) {
    // 传入的是Sub对象
    invokeFoo(Sub())
    val bb: Base = Sub()
    bb.foo()
}
