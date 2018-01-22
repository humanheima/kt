package base.chapter6.dot_1

/**
 * Created by dumingwei on 2018/1/1 0001.
 * Elvis运算符
 */
fun strLenSafe1(s: String?): Int = s?.length ?: 0

fun Person.countryName1(): String {
    return this.company?.address?.country ?: "unknown"
}

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No Address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city,$country")
    }

}


fun main(args: Array<String>) {
    println(strLenSafe1(null))
    val person = Person("Dmitry", null)
    println(person.countryName1())

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person1 = Person("Dmitry", jetbrains)
    printShippingLabel(person1)
    printShippingLabel(Person("Alexey", null))
}
