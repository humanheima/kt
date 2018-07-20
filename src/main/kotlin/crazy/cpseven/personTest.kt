
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
fun main(args: Array<String>) {


	// 使用Peron类定义一个Person类型的变量
	var p: Person
	// 通过new关键字调用Person类的构造器，返回一个Person对象
	// 将该Person对象赋给p变量
	p = Person()


	// 定义p变量的同时并为p变量赋值
	//var p1: Person = Person()


	// 访问p的name属性，直接为该属性赋值
	p.name = "李刚"
	// 调用p的say()方法，声明say()方法时定义了一个形参
	// 调用该方法必须为形参指定一个值
	p.say("Kotlin语言很简单，学习很容易！")
	// 直接输出p的name属性，将输出 李刚
	println(p.name)

}