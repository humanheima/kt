package base.chapter6.dot_2

/**
 * Created by dumingwei on 2018/1/2 0002.
 */
fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're $percent%done!")
}

fun main(args: Array<String>) {
    showProgress(146)
}