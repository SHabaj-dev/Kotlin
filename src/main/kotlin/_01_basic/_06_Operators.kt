package _01_basic

/*
    Arithmetic Operators - (+, -, *, /, %)
    Relational Operators - (<, >, <=, >=)
    Assignment Operators - (=, +=, -=, *=, /=, %=)
    Unary Operators - (+, -, ++, --, !)
    Logical Operators - (&&, ||, !)
    Bitwise Operators - (shl(bits), shr(bits), ushr(bits), and(bits), or(bits), xor(bits), inv())
 */


fun main() {

    val integerNumber: Int = 10
    //1010 -> 101000
    println(10.shl(2))
    //1010 -> 0010
    println(10.shr(2))

    println(10.ushr(2))

    //1010 -> 0101
    println(10.inv())

    println()

    val str1: String = "Shabaj"
    val str2: String = "something"
    println(str1.compareTo(str2))

}