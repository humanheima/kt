/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
// 定义一个数据类，
// 数据类会自动为每个属性定义对应的componentN方法
data class Result(val result: Int, val status: String)

fun factorialMultiReturn(n: Int): Result {
    if (n == 1) {
        return Result(1, "成功")
    } else if (n > 1) {
        return Result(factorialMultiReturn(n - 1).result * n, "成功")
    } else {
        return Result(-1, "参数必须大于0")
    }
}

fun main(args: Array<String>) {
    // 通过解构获取函数返回的两个值
    var (rt, status) = factorialMultiReturn(6)
    println(rt)
    println(status)

    var (_, status2) = factorialMultiReturn(-6)
    println(status2)

    var result = Result(2, "未知结果")
    // 调用copy()方法完成复制
    val oldRt = result.copy()
    println(oldRt)
}