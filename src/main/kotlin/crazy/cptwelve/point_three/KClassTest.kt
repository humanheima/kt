/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
import kotlin.reflect.full.*

// 定义注解
annotation class Anno

// 使用3个注解修饰该类
@Deprecated("该类已经不推荐使用")
@Anno
@Suppress("UNCHECKED_CAST")
class ClassTest(age: Int) {
    var name: String = "Kotlin"

    // 为该类定义一个私有的构造器
    private constructor() : this(20) {
    }

    // 定义一个有参数的构造器
    constructor(name: String) : this(15) {
        println("执行有参数的构造器:${name}")
    }

    // 定义一个无参数的info方法
    fun info() {
        println("执行无参数的info方法")
    }

    // 定义一个有参数的info方法
    fun info(str: String) {
        println("执行有参数的info方法"
                + "，其str参数值：" + str)
    }

    // 定义一个测试用的嵌套类
    class Inner
}

// 为ClassTest定义扩展方法
fun ClassTest.bar() {
    println("扩展的bar方法")
}

// 为ClassTest定义扩展属性
val ClassTest.foo: Double
    get() = 2.4

fun main(args: Array<String>) {
    // 下面代码可以获取ClassTest对应的KClass
    val clazz = ClassTest::class
    // 通过constructors属性获取KClass对象所对应类的全部构造器
    val ctors = clazz.constructors;
    println("ClassTest的全部构造器如下：")
    ctors.forEach { println(it) }
    println("ClassTest的主构造器如下：")
    println(clazz.primaryConstructor)

    // 通过functions属性获取该KClass对象所对应类的全部方法
    var funs = clazz.functions
    println("ClassTest的全部方法如下：")
    funs.forEach { println(it) }

    /*
    通过declaredFunctions属性获取该KClass对象
    本身所声明的全部方法（不包括继承的方法） */
    var funs2 = clazz.declaredFunctions
    println("ClassTest declaredFunctions")
    funs2.forEach { println(it) }

    /*
    通过declaredMemberFunctions属性获取该KClass对象
    本身所声明的全部成员方法（不包括继承的方法） */
    var memberFunctions = clazz.declaredMemberFunctions
    println("ClassTest declaredMemberFunctions")
    memberFunctions.forEach { println(it) }

    /*
    通过memberExtensionFunctions属性获取该KClass对象
    所代表类的全部扩展方法（不包括继承的方法） */
    var extensionFunctions = clazz.memberExtensionFunctions
    println("ClassTest extension Functions")
    extensionFunctions.forEach { println(it) }

    /*
    通过declaredMemberProperties属性获取该KClass对象
    本身所声明的全部成员属性（不包括继承的属性） */
    var memberProperties = clazz.declaredMemberProperties
    println("ClassTest本身声明的成员属性如下：")
    memberProperties.forEach { println(it) }

    /*
    通过memberExtensionProperties属性获取该KClass对象
    所代表类的全部扩展属性（不包括继承的属性） */
    var extensionProperties = clazz.memberExtensionProperties
    println("ClassTest的扩展属性如下：")
    extensionProperties.forEach { println(it) }

    // 通过annotations属性获取该KClass对象所对应类的全部注解
    val anns = clazz.annotations;
    println("ClassTest的全部注解如下：")
    anns.forEach { println(it) }
    println("该KClass元素上的@Anno注解为："
            + clazz.findAnnotation<Anno>())
    // 通过nestedClasses属性获取该KClass对象所对应类的全部嵌套类（包括内部类和嵌套类）
    val inners = clazz.nestedClasses
    System.out.println("ClassTest的全部内部类如下：")
    inners.forEach { println(it) }
    // 通过supertypes属性获取该类的所有父类型（包括父类和父接口）
    println("ClassTest的父类型为：" + clazz.supertypes)
}