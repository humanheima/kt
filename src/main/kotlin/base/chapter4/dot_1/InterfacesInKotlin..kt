package base.chapter4.dot_1

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

interface Clickable {
    fun click()
    fun showOff() = println("I am clickable")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"}focus.")
    fun showOff() = println("I'm focusable")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}