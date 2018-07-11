

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

class Dog{
	// 定义一个无参的run方法
	// 其类型是()->Unit类型
	fun run(){
		println("run方法")
	}
	// 定义一个带String参数的run方法
	// 其类型是(String)->Unit类型
	fun eat(food: String){
		println("正在吃：" + food)
	}
}
fun main(args: Array<String>) {
	// 将Dog的run方法赋值给rn变量
	// rn变量的类型应该是(Dog)->Unit
	var rn:(Dog)->Unit = Dog::run
	val d = Dog()
	rn(d)
	// 将Dog的et方法赋值给et变量
	// et变量的类型应该是(Dog, String)->Unit类型
	var et = Dog::eat
	et(d, "肉骨头")
}