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
package crazy.cptwelve.point_one

fun main(args: Array<String>) {
    val user = User()
    // 操作name读写属性
    user.name = "yeeku"
    println(user.name)
    // 操作isMarried读写属性
    user.isMarried = true
    println(user.isMarried)
    // 读取age只读属性
    println(user.age)
}