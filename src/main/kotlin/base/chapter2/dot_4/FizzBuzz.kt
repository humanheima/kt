package base.chapter2.dot_4

/**
 * Created by dumingwei on 2017/12/21 0021.
 */

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    /* for (i in 1..100) {
         print(fizzBuzz(i))
     }*/
    for (i in 0..10) {
        print("$i ")
    }
    println()
    for (i in 0 until 10) {
        print("$i ")
    }
    println()
    for (i in 0 until 10 step 2) {
        print("$i ")
    }
    println()
    for (i in 10 downTo (0) step (2)) {
        print("$i ")
    }
}