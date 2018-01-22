package base.chapter2.dot_3

/**
 * Created by dumingwei on 2017/12/21 0021.
 */

/**
 * 用 when 检查参数值的类型
 */
fun eval2(e: Expr): Int =
        when (e) {
            is Num ->// 1 用于检查参数类型的when分支
                e.value// 2 这里使用了智能类型转换
            is Sum ->
                eval2(e.left) + eval2(e.right)
            else ->
                throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(eval2(Sum(Num(1), Num(2))))
}