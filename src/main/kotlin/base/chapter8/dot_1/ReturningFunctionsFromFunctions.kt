package base.chapter8.dot_1

/**
 * Created by dumingwei on 2018/1/7 0007.
 */
enum class Delivery {
    STANDARD, EXPEDITED
}

class Order(val itemCount: Int)

fun getShippingCostCalculator(
        delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED)
        return { order: Order -> 6 + 2.1 * order.itemCount }
    return { order -> 1.2 * order.itemCount }
}

fun main(args: Array<String>) {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")
}