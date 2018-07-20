

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
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // 默认是public修饰
    
    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a不可访问
    // b、c、d可访问
    // Nested和e可访问

    override val b = 5   // 被重写的b依然是protected修饰
}

class Other(o: Outer) {
    // o.a、o.b不可访问
    // o.c与Other类在同一模块，可以访问
	// o.d可访问
    // Outer.Nested不可访问，Nested::e也不可访问
}