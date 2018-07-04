package base.chapter2.dot_1

/**
 * Created by dumingwei on 2017/12/19 0019.
 */
fun main(args: Array<String>) {
    println("Hello world")
    println(max(1, 2))
    val name = "world!"
    println("hello,$name")
    println("hello,${args[0]}")
    println("hello,${if (args.isNotEmpty()) args[1] else "someone"}")
    println("\$name")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/**
 * 表达式函数体
 */
fun max1(a: Int, b: Int): Int = if (a > b) a else b

/**
 * 类型推导
 */
fun max2(a: Int, b: Int) = if (a > b) a else b

/**
 * 声明变量同时初始化变量的值 忽略类型
 */
val question = "The Ultimate kotlin.getQuestion of Life, the Universe, and Everything"

val answer = 42

/**
 * 显式给出变量类型
 */
val answer1: Int = 42

//TODO 如何先声明一个变量，然后再赋值给它
/*
var answer2:Int
answer2=42
*/

