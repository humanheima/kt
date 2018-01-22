package base.chapter4.dot_4

/**
 * Created by dumingwei on 2018/1/18 0018.
 */
//这种声明方式为 饿汉模式
object Singleton {

    fun test() {
        println("hello singleton")
    }
}

//这种声明方式为 懒汉模式
class SingletonLazy private constructor() {

    companion object {
        val instance: SingletonLazy by lazy { SingletonLazy() }
    }

    fun test() {
        println("hello SingletonLazy")
    }
}

fun main(args: Array<String>) {
    Singleton.test()
    SingletonLazy.instance.test()
}
