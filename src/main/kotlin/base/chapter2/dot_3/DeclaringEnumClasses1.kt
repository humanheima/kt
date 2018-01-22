package base.chapter2.dot_3

/**
 * Created by dumingwei on 2017/12/20 0020.
 */

/**
 * 声明一个带属性的枚举类
 */
enum class Colors(val r: Int, val g: Int, val b: Int) {

    //创建每个常量的时候指定属性值
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    //给枚举类声明一个方法
    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args:Array<String>){
    println(Colors.BLUE.rgb())
}
