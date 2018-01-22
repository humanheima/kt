package base.chapter5.dot_2

import base.chapter5.dot_1.Person

/**
 * Created by dumingwei on 2017/12/24 0024.
 */
fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })
    val people = listOf(Person("Alice", 20), Person("Bob", 32))
    println(people.filter { it.age > 30 })
    println(people.map { it.name })

    val numbers = mapOf(1 to "one", 2 to "two")
    println(numbers.mapValues { it.value.toUpperCase() })
}