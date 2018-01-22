package base.chapter5.dot_4

/**
 * Created by dumingwei on 2017/12/26 0026.
 * 使用SMA构造方法来返回值
 */
fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}