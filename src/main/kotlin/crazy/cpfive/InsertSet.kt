package crazy.cpfive

/**
 * Created by dumingwei on 2018/7/8 0008.
 */
fun main(args: Array<String>) {

    var languages = mutableSetOf("swift")
    languages.add("java")
    languages.add("kotlin")
    println(languages)
    languages.addAll(setOf("c", "c++"))
    println(languages)
}