package base.chapter4.dot_2

/**
 * Created by dumingwei on 2017/12/31 0031.
 */
class User5(val name: String) {

    var address: String = "unspecified"
        set(value: String) {
            println("""
                1Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    val user = User5("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}