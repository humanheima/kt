package base.chapter3.dot_4

/**
 * Created by dumingwei on 2017/12/22 0022.
 */
/**
 * 展开运算符,中缀调用，
 */
fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("hello", "world")
    println(array.last())
    println(array.max())
    val list = listOf("args:", *array)
    println(list)

    val map = mapOf(1 to "one", 2 to "two", 3.to("three"))

    val (number, name) = 1 to "one"
    println("number=$number,name=$name")

}