package base.chapter4.dot_2

/**
 * Created by dumingwei on 2017/12/31 0031.
 */
interface UserWithDefaultGetterAndSetter {

    var email: String
    val nickname: String
        get() = email.substringBefore('@')
}

class UserWithImplemention(override var email: String) : UserWithDefaultGetterAndSetter

fun main(args: Array<String>) {
    val user = UserWithImplemention("hello@163.com")
    println("user.email=${user.email},user.nickname=${user.nickname}")
}

