

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
import java.util.Date
fun main(args: Array<String>){
	var date = Date()
	// when分支的条件表达式是Date类型
	when (date){
		Date() -> {
			println("优秀")
			println("望百尺竿头更进步")
		}
		else -> {
			println("不及格")
			println("啥也不说了，下次再来")
		}
	}
}
