package base.chapter4.dot_4

/**
 * Created by dumingwei on 2017/12/23 0023.
 * 在类的内部定义一个比较器
 */

data class Person(val name: String) {

    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int {
            return o1.name.compareTo(o2.name)
        }
    }
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}