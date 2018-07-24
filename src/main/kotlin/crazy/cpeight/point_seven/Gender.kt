

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
// 使用主构造器声明cnName只读属性
enum class Gender(val cnName: String) {
	MALE("men"), FEMALE("women");
	// 定义方法
	fun info(){
		when(this) {
			MALE -> println("天行健、君子以自强不息")
			FEMALE -> println("地势坤，君子以厚德载物")
		}
	}
}
