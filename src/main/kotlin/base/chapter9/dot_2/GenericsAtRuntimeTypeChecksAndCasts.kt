package base.chapter9.dot_2

/**
 * Created by dumingwei on 2018/1/7 0007.
 */
/*fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
            ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}*/
fun printSum(c: Collection<Int>) {
    if (c is List<Int>){
        print(c.sum())
    }
}

fun main(args: Array<String>) {
    //printSum(listOf(1, 2, 3))
    //printSum(setOf(1, 2, 3))
    //printSum(listOf("1", "2", "3"))
    printSum(listOf(1, 2, 3))
}