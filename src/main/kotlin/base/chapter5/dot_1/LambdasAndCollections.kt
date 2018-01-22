package base.chapter5.dot_1

/**
 * Created by dumingwei on 2017/12/24 0024.
 */

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOdest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOdest = person
        }
    }
    println(theOdest)
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)
    println(people.maxBy({ person: Person -> person.age }))
    println(people.maxBy() { person: Person -> person.age })
    println(people.maxBy { person: Person -> person.age })
    println(people.maxBy { person -> person.age })
    println(people.maxBy { it.age })
}