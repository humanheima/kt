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
package crazy.cptwelve.point_one

fun main(args: Array<String>) {
    val user = User()
    // ����name��д����
    user.name = "yeeku"
    println(user.name)
    // ����isMarried��д����
    user.isMarried = true
    println(user.isMarried)
    // ��ȡageֻ������
    println(user.age)
}