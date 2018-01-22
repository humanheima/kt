package base.chapter8.dot_1

/**
 * Created by dumingwei on 2018/1/7 0007.
 */
fun performRequest(
        url: String,
        callback: (code: Int, content: String) -> Unit) {

}

fun main(args: Array<String>) {
    val url = "http://kotl.in"
    performRequest(url) { code, content -> /*...*/ }
    performRequest(url) { code, page -> /*...*/ }
}