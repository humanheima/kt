fun main(args: Array<String>) {
    // 外层循环
    outer@ for (i in 0 until 5) {
        // 内层循环
        for (j in 0 until 3) {
            println("i的值为:${i}, j的值为:${j}")
            if (j == 1) {
                // 忽略outer标签所指定的循环中本次循环剩下的语句
                continue@outer
            }
        }
    }
}