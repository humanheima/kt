package base.chapter2.dot_2

/**
 * Created by dumingwei on 2017/12/19 0019.
 */
class Person(
        val name: String, //使用 val 定义变量对应java中的final变量 ，生成一个字段和一个getter
        var isMarried: Boolean //使用 var 对应 可变变量 ，生成一个字段 一个getter和一个setter
)
