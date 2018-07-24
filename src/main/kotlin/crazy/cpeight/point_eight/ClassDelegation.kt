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
package crazy.cpeight.point_eight

interface Outputable {
    fun output(msg: String)
    var type: String
}

// 定义一个DefaultOutput类实现Outputable接口
class DefaultOutput : Outputable {
    override fun output(msg: String) {
        for (i in 1..6) {
            println("<h${i}>${msg}</h${i}>")
        }
    }

    override var type: String = "sout device"
}

// 定义Printer为，指定构造参数b作为委托对象
class Printer(b: DefaultOutput) : Outputable by b

// 定义Projector为，指定新建的对象作为委托对象
class Projector : Outputable by DefaultOutput() {
    // 该类重写output()方法
    override fun output(msg: String) {
        javax.swing.JOptionPane.showMessageDialog(null, msg)
    }
}

fun main(args: Array<String>) {
    val output = DefaultOutput()
    // Printer对象的委托对象是output
    var printer = Printer(output)
    // 其实就是调用委托对象output()方法
    printer.output("fkit.org")
    // 其实就是调用委托对象type属性方法
    println(printer.type)
    // Projector对象的委托对象也是output
    var projector = Projector()
    // Projector本身重写了output()方法，所以此处是调用本类重写的方法
    projector.output("crazy")
    // 其实就是调用委托对象type属性方法
    println(projector.type)
}