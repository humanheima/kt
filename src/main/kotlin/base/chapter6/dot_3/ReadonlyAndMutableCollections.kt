package base.chapter6.dot_3

/**
 * Created by dumingwei on 2018/1/2 0002.
 */
fun<T>copyElements(source:Collection<T>,target:MutableCollection<T>){

    for (item in source){
        target.add(item)
    }
}

fun main(args: Array<String>) {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)
}