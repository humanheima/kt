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
package crazy.cpten.point_two

/**
 * 泛型协变
 */
class User<out T> {

    val info: T

    constructor(info: T) {
        this.info = info
    }

    fun test(): T {
        println("ִtest")
        return info
    }
}

fun main(args: Array<String>) {
    var user = User<String>("fkit")
    println(user.info)
    var u2: User<Any> = user
}
