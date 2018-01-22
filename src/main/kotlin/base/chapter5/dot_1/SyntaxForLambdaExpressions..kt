package base.chapter5.dot_1

/**
 * Created by dumingwei on 2017/12/24 0024.
 */

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum(1, 2))
    run { println(42) }// 运行Lambda中的代码
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })
    val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    val names1 = people.joinToString(" ") { p -> p.name }
    println(names)


}