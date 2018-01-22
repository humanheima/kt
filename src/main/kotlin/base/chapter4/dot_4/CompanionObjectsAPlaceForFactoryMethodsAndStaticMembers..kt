package base.chapter4.dot_4

/**
 * Created by dumingwei on 2017/12/23 0023.
 * 伴生对象
 */
class A {

    companion object {
        fun bar() {
            println("Companion object called ")
        }
    }
}

fun main(args: Array<String>) {
    //就好比在Java中调用A的静态方法
    A.bar()
}