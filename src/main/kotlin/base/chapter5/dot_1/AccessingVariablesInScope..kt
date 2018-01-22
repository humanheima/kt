package base.chapter5.dot_1

/**
 * Created by dumingwei on 2017/12/24 0024.
 */
fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {

    var clientError = 0
    var serveError = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientError++
        } else if (it.startsWith("5")) {
            serveError++
        }
    }
    println("$clientError client errors, $serveError server errors")
}

fun main(args: Array<String>) {

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val responses = listOf("200 OK", "418 I'm a teapot",
            "500 Internal Server Error")
    printProblemCounts(responses)
}