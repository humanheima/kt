package base.chapter2.dot_4

import java.util.*

/**
 * Created by dumingwei on 2017/12/21 0021.
 */
fun main(args: Array<String>) {

    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter=$binary")
    }

    var list = arrayListOf("3", "33", "333")
    for ((index, element) in list.withIndex()) {
        println("$index,$element")
    }
}