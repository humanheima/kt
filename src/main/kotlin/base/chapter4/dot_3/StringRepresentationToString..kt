package base.chapter4.dot_3

/**
 * Created by dumingwei on 2017/12/23 0023.
 */

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name,postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    fun copy(name: String = this.name, postalCode: Int = this.postalCode) = Client(name, postalCode)
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 323523)
    val client2 = Client("Alice", 323523)
    //kotlin中==检查对象是否相等，而不是比较引用这里会编译成调用"equals,"
    //如果想比较引用，可以使用===
    println(client1 == client2)
    val processed = hashSetOf(Client("Alice", 123))
    println(processed.contains(Client("Alice", 123)))

    println(client1.copy(postalCode = 12333))

}