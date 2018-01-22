package base.chapter3.dot_6

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

/**
 * 提取局部函数避免重复
 */
fun saveUser1(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}:$fieldName")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser1(User(1, "", ""))
}