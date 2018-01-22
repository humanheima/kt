package base.chapter4.dot_1

/**
 * Created by dumingwei on 2017/12/22 0022.
 */
class Outer {

    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}