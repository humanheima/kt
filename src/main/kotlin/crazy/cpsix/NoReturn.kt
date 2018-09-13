// 定义一个函数，该函数既无形参，也无返回值
fun foo() {
    println("程序执行foo()函数")
}

// 定义一个函数，该函数没有返回值，但函数有1个形参
fun sayHiNoReturn(name: String): Unit {
    println("====程序执行sayHi()函数====")
    println("${name}，你好。欢迎光临")
}

// 定义一个函数，该函数没有返回值，但函数有2个形参
fun showMsg(msg: String, count: Int) {
    for (i in 1..count) {
        println(msg)
    }
}

fun main(args: Array<String>) {
    foo()
    sayHiNoReturn("孙悟空")
    showMsg("欢迎学习Kotlin", 3)
}
