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
// 定义函数类型的形参，其中fn是(Int) -> Int类型的形参
inline fun mapTestInline(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
    var result = Array<Int>(data.size, { 0 })
    // 遍历data数组中每个元素，并用fn函数对data[i]进行计算
    // 然后将计算结果作为新数组的元素
    for (i in data.indices) {
        result[i] = fn(data[i])
    }
    return result
}

fun main(args: Array<String>) {
    var arr = arrayOf(20, 4, 40, 100, 30)
    var mappedResult1 = mapTestInline(arr, { it + 3 })
    println(mappedResult1.contentToString())
}