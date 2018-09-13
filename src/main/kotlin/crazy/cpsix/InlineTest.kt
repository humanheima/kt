/**
 * 内联函数
 */

inline fun mapTestInline(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
    val result = Array<Int>(data.size) { 0 }
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