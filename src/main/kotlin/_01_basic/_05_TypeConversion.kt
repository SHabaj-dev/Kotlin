package _01_basic

fun main() {
    val integerNumber: Int = 10
    val floatNumber: Float = integerNumber.toFloat()
    /*
    Similarly we can use
        toByte()
        toShort()
        toInt()
        toLong()
        toFloat()
        toDouble()
        toChar()
     */

    println("After Converting the number into Float $integerNumber becomes $floatNumber")
    println("$floatNumber is instance of Float Datatype. ")
}