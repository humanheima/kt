package reference

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(example: Example, property: KProperty<*>): String {
        return "$example, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(example: Example, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $example.")
    }

}

/**
 * 延迟属性,默认情况下，对于 lazy 属性的求值是同步锁的（synchronized）
 */
val lazyValue: String by lazy(LazyThreadSafetyMode.NONE) {
    println("computed!")
    "Hello"
}

/**
 * 可观察属性 Observable
 */
class User {
    var name: String by Delegates.observable("no name") { property, oldValue, newValue ->
        println("$oldValue->$newValue")
    }
}

/**
 *把属性储存在映射中
 */

class User1(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "NEW"
    println(lazyValue)
    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"

    val user1 = User1(mutableMapOf(
            "name" to "John Doe",
            "age" to 25
    ))

    println(user1.name) // Prints "John Doe"
    println(user1.age)  // Prints 25
    user1.name = "dumingwei"
    user1.age = 27
    println(user1.name)
    println(user1.age)

}