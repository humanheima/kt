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
package crazy.cpeight.point_one

class User(var first: String, var last: String) {
}

// 为User扩展读写属性
var User.fullName: String
    get() = "${first}.${last}"
    set(value) {
        println("fullName setter")
        // 如果value字符串中不包含.或包含几个.都不行
        if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
            println("invalid fullName")
        } else {
            var tokens = value.split(".")
            first = tokens[0]
            last = tokens[1]
        }
    }

fun main(args: Array<String>) {
    var user = User("悟空", "孙")
    println(user.fullName)
    user.fullName = "bajie.zhu"
    println(user.first)
    println(user.last)
}