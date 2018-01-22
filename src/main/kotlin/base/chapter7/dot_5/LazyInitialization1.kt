package base.chapter7.dot_5

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by dumingwei on 2018/1/5 0005.
 * 使用委托属性来实现惰性初始化
 */
fun loadEmails(person1: Person1): List<Email> {
    println("Load emails for ${person1.name}")
    return listOf(/*...*/)
}

class Person1(val name: String) {
    val emails by lazy { loadEmails(this) }
}

class LazyExample {

    val str: String by lazy {
        println("lazy")
        "hello world"
    }

}

class NotNllSingleValueVar<T>() : ReadWriteProperty<Any?, T> {
    private var value: T? = null
    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return value ?: throw IllegalStateException("${property.name} not initialized")
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        this.value = if (this.value == null) value
        else throw IllegalStateException("${property.name} already initialized")
    }
}

data class LazyUser(private val map: Map<String, String>) {
    val name: String by map
    val address: String by map
}

object DelegatesExt {
    fun <T> notNullSingleValue(): ReadWriteProperty<Any?, T> = NotNllSingleValueVar<T>()
}

fun main(args: Array<String>) {
    val p = Person("Alice")
    p.emails
    p.emails
    val user = LazyUser(mapOf("name" to "jenny", "address" to "shanghai"))
    println(user.name)
    var str: String by DelegatesExt.notNullSingleValue<String>()
    str="hello"

}
