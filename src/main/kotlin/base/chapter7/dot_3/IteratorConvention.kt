package base.chapter7.dot_3

import java.time.LocalDate

/**
 * Created by dumingwei on 2018/1/4 0004.
 */
operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start
            override fun hasNext(): Boolean {
                return current <= endInclusive
            }

            override fun next(): LocalDate = current.apply {
                current = plusDays(1)
            }
        }

fun main(args: Array<String>) {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff)
        println(dayOff)
}