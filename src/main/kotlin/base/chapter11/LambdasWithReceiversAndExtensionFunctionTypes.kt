package base.chapter11

/**
 * Created by dumingwei on 2018/1/21 0021.
 */
fun buildString(
        buildAction: (StringBuilder) -> Unit
): String {

    val sb = StringBuilder()
    buildAction(sb)
    return sb.toString()
}

/**
 * 待接收者的lambda
 */
fun buildString1(
        buildAction: StringBuilder.() -> Unit
): String {

    val sb = StringBuilder()
    buildAction(sb)
    return sb.toString()
}

fun buildString2(
        buildAction: StringBuilder.(prefix: String, suffix: String) -> Unit
): String {

    val sb = StringBuilder()
    buildAction(sb, "{ ", " }")
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        it.append("Hello,")
        it.append("World!")
    }
    println(s)
    val s1 = buildString1 {
        this.append("Hello,")
        append("World!")
    }
    println(s1)
    val s2 = buildString2 { prefix, suffix ->
        this.append(prefix)
        this.append("Hello")
        this.append("World")
        append(suffix)
    }
    println(s2)
}