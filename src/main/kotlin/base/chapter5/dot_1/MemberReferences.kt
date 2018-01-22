package base.chapter5.dot_1

/**
 * Created by dumingwei on 2017/12/24 0024.
 */

fun salute() {
    println("salute!")
}

fun salute1(message: String) {
    println("salute1,$message")
}

fun Person.isAdult() = age >= 21

fun main(args: Array<String>) {
    //这两行代码作用一样
    val getAge = { person: Person -> person.age }
    val getAge1 = Person::age

    //构造函数引用
    val createPerson = ::Person
    val p = createPerson("Alice", 20)
    val predicate = Person::isAdult
    println(p)
    run { salute() }
    run(::salute)
    run {
        salute1("j")
    }
}