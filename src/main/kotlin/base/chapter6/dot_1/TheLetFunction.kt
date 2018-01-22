package base.chapter6.dot_1

/**
 * Created by dumingwei on 2018/1/1 0001.
 */
fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) }
    "hh".isNullOrEmpty()
}