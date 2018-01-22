package base.chapter4.dot_2

/**
 * Created by dumingwei on 2017/12/31 0031.
 */
//
class Context

class AttributeSet
open class View {

    constructor(context: Context) {

    }

    constructor(context: Context, attr: AttributeSet) {

    }
}

class MyButton : View {

    /* //调用父类的构造方法
     constructor(context: Context) : super(context) {

     }*/
    constructor(context: Context) : this(context, AttributeSet()) {

    }

    constructor(context: Context, attr: AttributeSet) : super(context, attr) {

    }

}