package base.chapter8.dot_2

import java.util.concurrent.locks.Lock

/**
 * Created by dumingwei on 2018/1/7 0007.
 */
inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

/*fun foo(l: Lock) {
    println("Before sync")
    synchronized(l) {
        println("Action")
    }
    println("After sync")
}*/

class LockOwner(val lock:Lock){
    fun runUnderLock(body:()->Unit){
        synchronized(lock,body)
    }
}