package base.chapter8.dot_1

/**
 * Created by dumingwei on 2018/1/7 0007.
 */
fun <T> Collection<T>.joinToString(
        separator: String = ",",
        prefix: String = "",
        postfix: String = "",
        transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}

fun <T> Collection<T>.joinToString1(
        separator: String = ",",
        prefix: String = "",
        postfix: String = "",
        transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString())
    println(letters.joinToString { it.toLowerCase() })
    println(letters.joinToString(separator = "!", postfix = "!",
            transform = { it.toUpperCase() }))
    println(letters.joinToString1())
    println(letters.joinToString1 { it.toLowerCase() })
    println(letters.joinToString1(separator = "!", postfix = "!",
            transform = { it.toUpperCase() }))
}