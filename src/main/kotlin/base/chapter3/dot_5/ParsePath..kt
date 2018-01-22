package base.chapter3.dot_5

/**
 * Created by dumingwei on 2017/12/22 0022.
 */
fun main(args: Array<String>) {
    println("12.345-6.A".split(".","-"))
    parsePathRegular("/Users/yole/kotlin-book/chapter.adoc")
}

fun parsePath(path: String) {

    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val ext = fullName.substringAfterLast(".")
    println("Dir:$directory")
    println("name:$fileName")
    println("ext:$ext")
}

/**
 * 使用正则表达式来分割字符串
 */
fun parsePathRegular(path: String) {

    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir:$directory")
        println("name:$fileName")
        println("ext:$extension")
    }

}