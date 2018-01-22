package base.chapter7.dot_4

/**
 * Created by dumingwei on 2018/1/4 0004.
 */
fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key->$value")
    }
}

fun main(args: Array<String>) {
    val map= mapOf("Oracle" to "java","jetBrains" to "kotlin")
    printEntries(map)
}
