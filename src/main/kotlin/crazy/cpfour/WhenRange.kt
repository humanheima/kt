/**
 * when 处理范围
 */
fun main(args: Array<String>) {
    val age = java.util.Random().nextInt(100)
    println(age)
    // 使用when表达式对str赋值
    var str = when (age) {
        in 10..25 -> "当时年少青衫薄"
        in 26..50 -> "风景依稀似去年"
        in 51..80 -> "醉听清吟胜管弦"
        else -> "其他"
    }
    println(str)
}
