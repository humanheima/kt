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
package crazy.cpten.point_one

// 定义Apple类时使用了泛型声明
open class Apple<T> {
    // 使用泛型T定义属性
    open var info: T?

    constructor() {
        info = null
    }

    // 下面方法中使用泛型T来定义构造器
    constructor(info: T) {
        this.info = info
    }
}

fun main(args: Array<String>) {
    // 由于传给泛型T的是String，所以构造器参数只能是String
    var a1: Apple<String> = Apple<String>("苹果")
    println(a1.info)
    // 由于传给泛型T的是Int，所以构造器参数只能是Int
    var a2: Apple<Int> = Apple(3)
    System.out.println(a2.info)
    // 由于构造器参数只能是Double，因此系统可推断泛型形参为Double类型
    var a3 = Apple(5.67)
    System.out.println(a3.info)

    // 系统无法推断是T是何种类型，因此编译报错
//	var a4 = Apple()
}

// 下面代码编译报错
//class A: Apple<T>()
class A : Apple<String>()

// 使用Apple类时，没有为泛型T传入实际的类型参数，编译报错
//public class A extends Apple
