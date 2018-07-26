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

import kotlin.reflect.*
import kotlin.reflect.full.*

class Item2 {
    var name: String = "疯狂Kotlin讲义"
    val price: Double = 76.6
}

var foo = "test property"
fun main(args: Array<String>) {
    // 获取foo属性，属于KMutableProperty0的实例
    val topProp = ::foo
    topProp.set("modified property")
    println(topProp.get())

    val im = Item2()
    // 获取Item的name属性，属于KMutableProperty1的实例
    val mp = Item2::name
    mp.set(im, "疯狂Java讲义")
    println(mp.get(im))

    // 获取Item的name属性，属于KProperty1的实例
    val prop = Item2::price
    println(prop.get(im))
}