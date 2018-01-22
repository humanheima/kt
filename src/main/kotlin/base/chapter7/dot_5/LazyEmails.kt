package base.chapter7.dot_5

/**
 * Created by dumingwei on 2018/1/5 0005.
 * 使用支持属性实现惰性初始化
 */

class Email

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String) {
    private var _emails: List<Email>? = null

    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }
}

fun main(args: Array<String>) {
    val p = Person("Alice")
    p.emails
    p.emails
}