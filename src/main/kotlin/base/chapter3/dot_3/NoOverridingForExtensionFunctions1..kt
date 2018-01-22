package base.chapter3.dot_3

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

//分别给View类和Button类添加扩展函数
fun View.showOff() = println("I'm a View!")

fun Button.showOff() = println("I'm a View!")

fun main(args: Array<String>) {
    val view: View = Button()
    view.showOff()
}