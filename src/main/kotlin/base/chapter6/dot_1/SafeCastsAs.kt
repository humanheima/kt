package base.chapter6.dot_1

/**
 * Created by dumingwei on 2018/1/1 0001.
 */
class Person1(val firstName: String, val lastName: String) {

    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person1 ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int {
        return firstName.hashCode() * 37 + lastName.hashCode()
    }
}

fun main(args: Array<String>) {
    val p1 = Person1("Dmitry", "Jemerov")
    val p2 = Person1("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(42))
}