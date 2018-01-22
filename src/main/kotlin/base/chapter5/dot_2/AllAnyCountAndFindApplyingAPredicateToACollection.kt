package base.chapter5.dot_2

import base.chapter5.dot_1.Person

/**
 * Created by dumingwei on 2017/12/24 0024.
 */

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27))

    val list = listOf(1, 2, 3)
    println(list.any { it != 3 })

    println(people.find(canBeInClub27))

    val peopleGroup = listOf(Person("Alice", 31),
            Person("Bob", 29), Person("Carol", 31))

    println(peopleGroup.groupBy { it.age })

    val strings = listOf("a", "ab", "b")
    println(strings.groupBy(String::first))

}