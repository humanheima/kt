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
package crazy.cpeight.point_two

// 定义可初始化两个属性的构造器
class Address(val detail: String, val postCode: String) {
    // 重写equals()方法，判断两个对象是否相等
    override operator fun equals(other: Any?): Boolean {
        if (this == other) {
            return true
        }
        if (other == null) {
            return false
        }
        if (other.javaClass == Address::class) {
            var ad = other as Address
            // 当detail和postCode相等时，可认为两个Address对象相等
            return this.detail.equals(ad.detail)
                    && this.postCode.equals(ad.postCode)
        }
        return false
    }

    override fun hashCode(): Int {
        return detail.hashCode() + postCode.hashCode() * 31
    }
}
