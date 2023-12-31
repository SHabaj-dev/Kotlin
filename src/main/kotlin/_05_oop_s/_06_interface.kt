package _05_oop_s

interface Calculator {
    fun add(num1: Int, num2: Int): Int
    fun multiply(num1: Int, num2: Int): Int

    fun divide(num1: Int, num2: Int): Double = (num1 / num2).toDouble()
}

class _06_interface : Calculator {
    override fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun multiply(num1: Int, num2: Int): Int {
        return num1 + num2
    }

}

fun main() {
    val myCalculator = _06_interface()
    val sum = myCalculator.add(10, 20)
    println("Sum of 10 and 20 is $sum")
    print(myCalculator.divide(100, 20))

}