package base.chapter2.dot_2

import java.util.Random

/**
 * Created by dumingwei on 2017/12/19 0019.
 */
class Rectangle(val height: Int, val width: Int) {

    val isSquare: Boolean get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}