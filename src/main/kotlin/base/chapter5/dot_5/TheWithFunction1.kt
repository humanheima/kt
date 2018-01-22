package base.chapter5.dot_5

/**
 * Created by dumingwei on 2017/12/26 0026.
 */
fun alphabet1(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }

}

fun main(args: Array<String>) {
    println(alphabet1())
}