package base.chapter7.dot_4

/**
 * Created by dumingwei on 2018/1/4 0004.
 */
data class NameComponents(
        val name: String,
        val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}

fun main(args: Array<String>) {
    val (name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)
}