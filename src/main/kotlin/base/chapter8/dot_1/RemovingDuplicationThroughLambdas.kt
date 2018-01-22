package base.chapter8.dot_1

/**
 * Created by dumingwei on 2018/1/7 0007.
 */
enum class OS {
    WINDOWS, LINUX, MAC, IOS, ANDROID
}

data class SiteVisit(
        val path: String,
        val duration: Double,
        val os: OS
)

val log = listOf(
        SiteVisit("/", 34.0, OS.WINDOWS),
        SiteVisit("/", 22.0, OS.MAC),
        SiteVisit("/login", 12.0, OS.WINDOWS),
        SiteVisit("/signup", 8.0, OS.IOS),
        SiteVisit("/", 16.3, OS.ANDROID)
)

val averageWindowsDuration = log
        .filter { it.os == OS.WINDOWS }
        .map { it.duration }
        .average()

fun List<SiteVisit>.averageDurationFor(os: OS) = filter {
    it.os == os
}.map(SiteVisit::duration).average()

val averageMobileDuration = log
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map(SiteVisit::duration)
        .average()

/**
 * 使用高阶函数
 */
fun List<SiteVisit>.averageLambda(predicate: (SiteVisit) -> Boolean) =
        filter(predicate).map(SiteVisit::duration).average()

fun main(args: Array<String>) {
    println(averageWindowsDuration)
    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))
    println(averageMobileDuration)

    println(log.averageLambda {
        it.os in setOf(OS.ANDROID, OS.IOS)
    })
    println(log.averageLambda {
        it.os == OS.IOS && it.path == "/signup"
    })
}
