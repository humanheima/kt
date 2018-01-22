package base.chapter3.dot_6

/**
 * Created by dumingwei on 2017/12/22 0022.
 */
class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}:empty Name")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
                "Can't save user ${user.id}: empty Address")
    }

    // Save user to the database
}

fun main(args: Array<String>) {
saveUser(User(1,"",""))
}