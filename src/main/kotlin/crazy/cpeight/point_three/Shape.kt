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

abstract class Shape {
    init {
        println("shape init")
    }

    var color = ""
    // 定义一个计算周长的抽象方法
    abstract fun calPerimeter(): Double

    // 定义一个代表形状的抽象的、只读属性
    // 抽象属性无需初始值
    abstract val type: String

    // 定义Shape的构造器，该构造器并不是用于创建Shape对象
    // 而是用于被子类调用
    constructor() {}

    constructor(color: String) {
        println("execute shape constructor")
        this.color = color
    }
}

