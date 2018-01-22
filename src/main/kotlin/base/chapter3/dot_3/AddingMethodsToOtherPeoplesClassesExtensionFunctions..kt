package base.chapter3.dot_3

/**
 * Created by dumingwei on 2017/12/22 0022.
 * 扩展函数 给String类添加 lastChar 方法
 */
fun String.lastChar(): Char {
    println(isEmpty())
    return this.get(this.length - 1)
}

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}