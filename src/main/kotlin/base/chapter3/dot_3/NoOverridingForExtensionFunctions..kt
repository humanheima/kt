package base.chapter3.dot_3

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

/**
 * 重写成员函数
 */
open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}

fun main(args: Array<String>) {

    val view:View = Button ()
    view.click()
}