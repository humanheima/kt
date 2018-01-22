package base.chapter4.dot_3

/**
 * Created by dumingwei on 2017/12/23 0023.
 * 数据类
 * 使用 data 自动生成通用的方法
 */
data class Client1(val name: String, val postalCode: Int) {

}

fun main(args: Array<String>) {
    val client1 = Client1("Alice", 323523)
    val client2 = Client1("Alice", 323523)
    println(client1)
    //copy一个对象
    println(client1.copy(name = "Alice1", postalCode = 123))
    println(client1 == client2)
    val processed = hashSetOf(Client1("Alice", 123))
    println(processed.contains(Client1("Alice", 123)))
}