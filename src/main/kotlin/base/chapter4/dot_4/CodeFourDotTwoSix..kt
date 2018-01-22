package base.chapter4.dot_4

/**
 * Created by dumingwei on 2017/12/23 0023.
 * 使用工厂方法替代从构造方法,
 * 对比 CodeFourDotTwoFive.kt
 */
fun getFacebookName(facebookAccountId: Int): String {
    return "fb$facebookAccountId"
}

class User1 private constructor(val nickname: String) {

    companion object {
        fun newSubscribingUser(email: String) = User1(email.substringBefore('@'))
        fun newFacebookUser(facebookAccountId: Int) = User1(getFacebookName(facebookAccountId))
    }

}

fun main(args: Array<String>) {
    val user1 = User1.newSubscribingUser("hello@email.com")
    val user2 = User1.newFacebookUser(123)
    println(user1.nickname)
    println(user2.nickname)
}