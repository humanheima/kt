package base.chapter2.dot_3

/**
 * Created by dumingwei on 2017/12/21 0021.
 */

fun eval1(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval1(e.left) + eval1(e.right)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(eval1(Sum(Num(1),Num(2))))
}
