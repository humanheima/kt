package base.chapter5.dot_3

import java.io.File

/**
 * Created by dumingwei on 2017/12/24 0024.
 */
fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }
//fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }

fun main(args: Array<String>) {
    val naturalNumbers = generateSequence(0, { it + 1 })
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
}