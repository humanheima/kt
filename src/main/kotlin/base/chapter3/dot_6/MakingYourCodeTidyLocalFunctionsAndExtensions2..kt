package base.chapter3.dot_6

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

/**
 * 在局部函数中访问外层函数的参数
 */

fun saveUser2(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}:$fieldName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser2(User(1, "", ""))
}