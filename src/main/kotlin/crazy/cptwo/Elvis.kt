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
fun main(args: Array<String>) {
    var b: String? = "fkit"
    // 先判断b不为null，然后访问b的length属性
    var len1 = if (b != null) b.length else -1
    println(len1)
    b = null
    // 使用Elvis运算符
    var len2 = b?.length ?: -1
    println(len2);
}
