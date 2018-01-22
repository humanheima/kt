package base.chapter3.dot_6

/**
 * Created by dumingwei on 2017/12/22 0022.
 */

/**
 * 提取验证逻辑到扩展函数
 */
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id:empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser3(user: User) {
    user.validateBeforeSave()
    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser3(User(1, "", ""))
}