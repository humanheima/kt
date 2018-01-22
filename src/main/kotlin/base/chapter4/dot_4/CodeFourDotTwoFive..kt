package base.chapter4.dot_4

/**
 * Created by dumingwei on 2017/12/23 0023.
 * 代码清单 4.25
 */

class User {
    val nickNmae: String

    constructor(email: String) {
        nickNmae = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickNmae = getFacebookName(facebookAccountId)
    }

}

fun main(args: Array<String>) {

    val user1 = User("humanheima@gmail.com")
    val user2 = User(2)
}