

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
fun main(args: Array<String>){
	var score = 'B'
	when (score){
		'A' -> {
			println("优秀")
			println("望百尺竿头更进步")
		}
		'B' -> {
			println("良好")
			println("不拼一把，你不知道自己的能力")
		}
		'C' -> println("中")
		'D' -> println("及格")
		else -> {
			println("不及格")
			println("啥也不说了，下次再来")
		}
	}
}
