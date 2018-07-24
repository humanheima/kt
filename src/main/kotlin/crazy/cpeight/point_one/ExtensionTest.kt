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
package crazy.cpeight.point_one

fun main(args: Array<String>) {
    var t = Raw()
    t.test()
    // 调用Raw对象扩展出来的方法
    t.info()
    // 创建Raw类的子类的实例
    var rs = RawSub()
    rs.test()
    rs.sub()
    // Raw的子类的对象也可调用扩展出来的方法
    rs.info()
}