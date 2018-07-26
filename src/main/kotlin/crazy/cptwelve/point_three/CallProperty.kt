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
package  crazy.cptwelve.point_three

import kotlin.reflect.*
import kotlin.reflect.full.*

class Item1 {
    var name: String = "疯狂Kotlin讲义"
    val price: Double = 76.6
}

fun main(args: Array<String>) {
    val clazz = Item1::class
    val ins = clazz.createInstance()
    val props = clazz.declaredMemberProperties
    props.forEach {
        when (it.name) {
            "name" -> {
                @Suppress("UNCHECKED_CAST")
                // 将属性转换为读写属性
                val mp = it as KMutableProperty1<Item1, Any>
                // 修改属性值
                mp.set(ins, "疯狂Java讲义")
                println(it.get(ins))
            }
            "price" -> {
                // 只读属性，只能通过get()方法读取属性值
                println(it.get(ins))
            }
        }
    }
}