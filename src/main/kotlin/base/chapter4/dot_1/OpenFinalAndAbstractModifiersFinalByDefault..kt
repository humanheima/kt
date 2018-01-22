package base.chapter4.dot_1

/**
 * Created by dumingwei on 2017/12/22 0022.
 */
//这个类是open的，可以被继承
open class RichButton : Clickable {

    fun disable() {}//这个函数是final的
    open fun animate() {}//这个函数是open的可以被重写
    //实现接口中的方法，并且这个方法可以被重写
    override fun click() {
    }
}

fun main(args: Array<String>) {

}