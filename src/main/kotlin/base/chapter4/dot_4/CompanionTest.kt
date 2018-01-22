package base.chapter4.dot_4

/**
 * Created by dumingwei on 2017/12/31 0031.
 * 伴生对象
 */
data class Person1(val name: String) {

    companion object {
        fun fromJson(jsonText: String): Person1 = Person1("hello")
    }

}

/**
 * 在伴生对象中实现接口
 */
interface Factory<T> {
    fun fromJson(jsonText: String): T
}

data class Person2(val name: String) {

    companion object : Factory<Person2> {

        override fun fromJson(jsonText: String): Person2 = Person2("factory")
    }

}

fun main(args: Array<String>) {
    println(Person1.fromJson("Alice"))
    println(Person2.fromJson("hhah"))
}

