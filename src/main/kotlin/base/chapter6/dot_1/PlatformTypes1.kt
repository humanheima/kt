package base.chapter6.dot_1

/**
 * Created by dumingwei on 2018/1/1 0001.
 */
fun yellAtSafe(person:PersonJava){
    println((person.name?:"anyone").toUpperCase())
}

fun main(args: Array<String>) {
    yellAtSafe(PersonJava(null))
}
