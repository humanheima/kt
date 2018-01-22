package base.chapter4.dot_2

/**
 * Created by dumingwei on 2017/12/23 0023.
 */

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += counter + word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}