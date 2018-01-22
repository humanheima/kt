package base.chapter4.dot_4

import java.io.File
import java.util.Comparator

/**
 * Created by dumingwei on 2017/12/23 0023.
 * 对象声明可以继承类和接口
 */

object CaseInsensitiveFileComparator : Comparator<File> {

    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

fun main(args: Array<String>) {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
    val files= listOf(File("/Z"),File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
}