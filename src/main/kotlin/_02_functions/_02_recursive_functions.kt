package _02_functions

/*
Function calling them self from inside is known as recursive function
 */

fun printNumber(number: Int) {
    if (number == 0) {
        return
    }
    //Function calling ite self inside the function.
    printNumber(number - 1)
    println(number)
}

fun main() {
    printNumber(5)
}