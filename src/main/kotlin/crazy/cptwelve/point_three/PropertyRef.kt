/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
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
    var name: String = "���Kotlin����"
    val price: Double = 76.6
}

var foo = "test property"
fun main(args: Array<String>) {
    // ��ȡfoo���ԣ�����KMutableProperty0��ʵ��
    val topProp = ::foo
    topProp.set("modified property")
    println(topProp.get())

    val im = Item2()
    // ��ȡItem��name���ԣ�����KMutableProperty1��ʵ��
    val mp = Item2::name
    mp.set(im, "���Java����")
    println(mp.get(im))

    // ��ȡItem��name���ԣ�����KProperty1��ʵ��
    val prop = Item2::price
    println(prop.get(im))
}