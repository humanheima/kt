package base.chapter5.dot_3

import base.chapter5.dot_1.Person

/**
 * Created by dumingwei on 2017/12/24 0024.
 */
fun main(args: Array<String>) {
    fun2()
}

private fun fun2() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31),
            Person("Charles", 31), Person("Dan", 21))
    println(people.asSequence()
            .map(Person::name)
            .filter { it.length < 4 }
            .toList())
}

private fun fun1() {
    listOf(1, 2, 3, 4)
            .asSequence()
            .map {
                print("map($it) ")
                it * it
            }
            .filter {
                print("filter($it)")
                it % 2 == 0
            }
            .toList()
}