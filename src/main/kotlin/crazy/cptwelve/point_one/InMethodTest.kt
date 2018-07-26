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

/**
 * 如果 java类中的方法名是kotlin中的关键字，那么在调用该方法的时候，需要使用反引号进行转义
 */
fun main(args: Array<String>) {
    val im = InMethod()
    //im.in()
    im.`in`()
    val a: Int? = 2
}