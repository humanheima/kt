package base.chapter5.dot_2

/**
 * Created by dumingwei on 2018/1/22 0022.
 * Collection 的操作
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6)
    /*  //如果至少有一个元素符合给出的判断条件，则返回true。
      println(list.any { it % 2 == 0 })
      //如果全部的元素符合给出的判断条件，则返回true。
      println(list.all { it > 10 })
      //返回符合给出判断条件的元素总数。
      println(list.count({ it % 2 == 0 }))
      //fold 从 一个初始值开始 + 集合的每一个元素，这个例子中就是 3 + 1+2+3+4+5+6
      println(list.fold(3, { total, next ->
          total + next
      }))
      //和fold一样，只不过顺序从右到左
      println(list.foldRight(3, { total, next ->
          total + next
      }))
      println("*************************")
      //从一个初始值累加 从左到右累加每个元素，并加上元素的下标
      println(
              list.foldIndexed(1) { index, acc, element ->
                  println("index=$index,acc=$acc,n=$element")
                  index + acc + element
              }
      )
      println("*************************")
      //从一个初始值累加 从右到左累加每个元素，并加上元素的下标
      println(
              list.foldRightIndexed(1) { index, acc, element ->
                  println("index=$index,acc=$acc,n=$element")
                  index + acc + element
              }
      )
      println("*************************")
      list.forEach { print(it) }
      list.forEachIndexed { index, i -> print("index=$index,i=$i") }
      println("*************************")
      println(list.max())
      println("*************************")
      println(list.maxBy { it % 2 == 0 })
      println("*************************")
      println(list.min())
      println("*************************")
      println(list.minBy { -it })*/
    /*  //返回包含去掉前n个元素的所有元素的列表。
      println(list.drop(4))

      println(list.dropWhile({ it < 3 }))
      println(list.dropLastWhile { it > 4 })
      println(list.filter { it > 4 })
      println(list.filterNot { it > 4 })
      //过滤一个list中指定index的元素。
      println(list.slice(1..3))
      println(list.slice(listOf(1, 3, 4)))
      //返回从第一个开始的n个元素。
      println(list.take(2))
      println(list.takeLast(2))
      println(list.takeWhile { it < 3 })*/

    /*println(list.elementAtOrElse(10, { 3 }))
    println(list.mapNotNull { it * 2 })
    println(list.mapIndexed { index, i -> index * i })
    println(list.map { it * 2 })
    println(list.flatMap { listOf(it + 1) })

    println(list.groupBy { if (it % 2 == 0) "even" else "odd" })

    println(list.partition { it % 2 == 0 })
    println(list + listOf(9, 10))
    //返回由pair组成的List，每个pair由两个集合中相同index的元素组成。这个返回的List的大小由最小的那个集合决定。
    println(list.zip(listOf(7, 8)))
    println(listOf(Pair(5, 56), Pair(6, 8)).unzip())
    val (list1, list2) = listOf(Pair(5, 56), Pair(6, 8)).unzip()
    println(list1)
    println(list2)
*/
    println(list.reversed())
    println(list.sorted())
    println(list.sortedDescending())
    println(list.sortedByDescending { it % 2 })
    println(list.sortedBy { it % 2 == 0 })
}