package base.chapter7.dot_5

/**
 * Created by dumingwei on 2018/1/5 0005.
 */
class Person5 {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String
        get() = _attributes["name"]!!
}

class Person6 {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    //把map作为委托属性
    val name: String by _attributes
    val company: String by _attributes
}

fun main(args: Array<String>) {
    val p = Person5()
    val data = mapOf(Pair("name", "Dmitry"), Pair("company", "JetBrains"))
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)
    println(p.name)
    val p1 = Person6()
    for ((attrName, value) in data)
        p1.setAttribute(attrName, value)
    println(p1.name)
    println(p1.company)
}