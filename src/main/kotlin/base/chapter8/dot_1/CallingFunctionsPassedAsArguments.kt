package base.chapter8.dot_1

/**
 * Created by dumingwei on 2018/1/7 0007.
 */
fun twoAndThree(operation: (Int, Int) -> Int) {

    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}

fun main(args: Array<String>) {
    //下面三种调用方式
    twoAndThree({ a, b -> a + b })
    twoAndThree() { a, b -> a * b }
    twoAndThree { a, b -> a - b }

    println("ab1c".filter { it in 'a'..'z' })

    processTheAnswer { number -> number + 1 }
}