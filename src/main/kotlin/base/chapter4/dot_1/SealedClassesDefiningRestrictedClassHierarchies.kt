package base.chapter4.dot_1

/**
 * Created by dumingwei on 2017/12/22 0022.
 * 定义密封类
 */
sealed class Expr {
    class Num(val value: Int) : Expr()

    class Sum(val left: Expr, val right: Expr) : Expr()

}


fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.right) + eval(e.left)
        }


sealed class Operation {

    class Add(val value: Int) : Operation()
    class Substract(val value: Int) : Operation()
    class Multiply(val value: Int) : Operation()
    class Divide(val value: Int) : Operation()

    //If a subclass doesn’t keep state, it can just be an object
    object Increment : Operation()
    object Decrement : Operation()

}

fun execute(x: Int, op: Operation) = when (op) {
    is Operation.Add -> x + op.value
    is Operation.Substract -> x - op.value
    is Operation.Multiply -> x * op.value
    is Operation.Divide -> x / op.value
    is Operation.Increment -> x + 1
    is Operation.Decrement -> x - 1
}

fun main(args: Array<String>) {
    println(execute(10, Operation.Add(2)))
    println(execute(10, Operation.Increment))
}
