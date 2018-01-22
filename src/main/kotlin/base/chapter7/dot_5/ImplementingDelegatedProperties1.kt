package base.chapter7.dot_5

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 * Created by dumingwei on 2018/1/5 0005.
 * 通过辅助类来实现属性变化的通知
 */
class ObservableProperty(val propName: String, var propValue: Int,
                         val changeSupport: PropertyChangeSupport) {
    fun getValue(): Int = propValue
    fun setValue(newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName, oldValue, newValue)
    }
}

class Person3(val name: String, age: Int, salary: Int
) : PropertyChangeAware() {

    val _age = ObservableProperty("age", age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(value) {
            _age.setValue(value)
        }
    val _salary = ObservableProperty("salary", salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(value) {
            _salary.setValue(value)
        }
}

fun main(args: Array<String>) {
    val p = Person3("Dmitry", 34, 2000)
    p.addPropertyChangeListener(
            PropertyChangeListener { event ->
                println("Property ${event.propertyName} changed " +
                        "from ${event.oldValue} to ${event.newValue}")
            }
    )
    p.age = 35
    p.salary = 2100
}
