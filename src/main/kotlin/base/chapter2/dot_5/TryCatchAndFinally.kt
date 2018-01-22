package base.chapter2.dot_5

import java.io.BufferedReader
import java.io.StringReader

/**
 * Created by dumingwei on 2017/12/21 0021.
 */

fun main(args: Array<String>) {

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}