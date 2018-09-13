inline fun each(data: Array<Int>, fn: (Int) -> Unit) {
    for (el in data) {
        fn(el)
    }
}

inline fun fx(crossinline body: () -> Unit) {
    val f = object : Runnable {
        override fun run() = body()
    }
    f.run()
}

fun main(args: Array<String>) {
    fx { println(3) }
    val arr = arrayOf(20, 4, 40, 100, 30)
    each(arr) {
        println(it)
        return
    }


}