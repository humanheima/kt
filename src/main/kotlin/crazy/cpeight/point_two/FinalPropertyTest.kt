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
package crazy.cpeight.point_two

open class FinalPropertyTest {
    // Kotlin自动为该属性添加final修饰
    open var test: String = "测试属性"
}

class Sub : FinalPropertyTest() {
    // 下面属性定义将出现编译错误，不能重写final属性
    override var test: String = "子类属性"
}