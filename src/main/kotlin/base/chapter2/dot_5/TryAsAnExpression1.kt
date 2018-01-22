package base.chapter2.dot_5

import java.io.BufferedReader
import java.io.StringReader

/**
 * Created by dumingwei on 2017/12/21 0021.
 */

fun main(args: Array<String>) {

    val reader = BufferedReader(StringReader("not a number"))
    readNumber1(reader)
}

fun readNumber1(reader: BufferedReader) {
    val number = try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}