package base.chapter6.dot_1

/**
 * Created by dumingwei on 2018/1/1 0001.
 */
fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank())
        println("Please fill in the required fields")
}

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
}