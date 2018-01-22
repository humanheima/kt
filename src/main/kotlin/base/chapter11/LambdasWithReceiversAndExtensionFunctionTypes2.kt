package base.chapter11

/**
 * Created by dumingwei on 2018/1/21 0021.
 */
val appendExcel:StringBuilder.()->Unit={
    this.append("!")
}

fun main(args: Array<String>) {
    val sb=StringBuilder("Hi")
    sb.appendExcel()
    println(sb)
    println(buildString(appendExcel))
}