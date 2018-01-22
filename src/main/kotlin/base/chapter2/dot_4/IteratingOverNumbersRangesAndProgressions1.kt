package base.chapter2.dot_4

/**
 * Created by dumingwei on 2017/12/21 0021.
 */
fun fizzBuzz1(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz1(i))
    }
}