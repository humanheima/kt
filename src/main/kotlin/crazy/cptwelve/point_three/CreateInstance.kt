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

import kotlin.reflect.full.*

class Item(var name: String) {
    var price = 0.0

    constructor() : this("unknown goods") {
        this.price = 0.0
    }

    constructor(name: String, price: Double) : this(name) {
        this.price = price
    }
}

fun main(args: Array<String>) {
    val clazz = Item::class
    // createInstance()方法调用无参数的构造器创建实例
    val inst1 = clazz.createInstance()
    println(inst1.name)
    println(inst1.price)
    // 获取所有构造器
    val cons = clazz.constructors
    cons.forEach {
        if (it.parameters.size == 2) {
            // 调用带2个参数的构造器创建实例
            val inst2 = it.call("Kotlin", 78.8)
            println(inst2.name)
            println(inst2.price)
        }
    }
}