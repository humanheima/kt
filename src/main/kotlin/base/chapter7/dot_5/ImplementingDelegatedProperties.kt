package base.chapter7.dot_5

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 * Created by dumingwei on 2018/1/5 0005.
 */
open class PropertyChangeAware {

    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class Person2(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("age", oldValue, newValue)
        }
    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("salary", oldValue, newValue)
        }
}

fun main(args: Array<String>) {
    val p = Person2("Dmitry", 34, 2000)
    p.addPropertyChangeListener(PropertyChangeListener { event ->
        println("Property ${event.propertyName} changed " +
                "from ${event.oldValue} to ${event.newValue}")
    })
    p.age=35
    p.salary=2100
}
