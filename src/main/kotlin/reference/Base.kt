package reference

/**
 * 委托
 */
interface Base {
    val message: String
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x: Int) : Base {
    override val message: String
        get() = "BaseImpl: x = $x"

    override fun printMessage() { println(message) }
    override fun printMessageLine() { println(x) }
}

class Derived(b: Base) : Base by b {
    // 在 b 的 `print` 实现中不会访问到这个属性
    override val message: String ="Message of Derived"

    override fun printMessageLine() {
        println("abc")
    }
}

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).printMessage()//输出 BaseImpl: x = 10
    Derived(b).printMessageLine()//输出abc，而不是10
}