package base.chapter4.dot_2

/**
 * 在主构造函数中如果不用修饰符修饰name的话，那么只能在声明属性和初始化块中使用name。
 */
class TestConstruct(name: String) {

    val _name = name

    init {
        val nameLeng = name.length
    }

    fun test() {
        print(_name)
    }
}
