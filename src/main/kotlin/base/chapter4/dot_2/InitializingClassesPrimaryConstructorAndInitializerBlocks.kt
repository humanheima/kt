package base.chapter4.dot_2

/**
 * Created by dumingwei on 2017/12/31 0031.
 * 下列所有的User类的声明都是等价的
 */
open class User(val nickname: String)

class TwitterUser(nickname: String, val id: Int) : User(nickname) {

    fun getInfo() = "nickname=$nickname,id=$id"
}

class User1 constructor(nickname: String) {

    val nickname: String

    init {
        this.nickname = nickname
    }
}

class User2 constructor(nickname: String) {

    val nickname: String = nickname

}

class User3(nickname: String) {

    val nickname: String = nickname

}

/**
 * 为构造方法的参数声明一个默认值,如果每个参数都有默认值，那么编译器
 * 会生成一个无参数的构造方法
 */
class User4(val nickname: String = "dmw", val isSubscribed: Boolean = false)


fun main(args: Array<String>) {
    val user = User("bob")
    println(user.nickname)

    val user1 = User1("alice")
    println(user1.nickname)

    val user2 = User1("alice")
    println(user2.nickname)

    //生成的无参数的构造方法
    val user4 = User4()
    println(user4.nickname)

    val twitterUser = TwitterUser("twitter", 1)
    println(twitterUser.getInfo())
}