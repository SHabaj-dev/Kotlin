package _02_functions

/*
Function is a block of code which is written to perform a particular task
 */

fun main() {
    //Example of built in function: println()
    println("This is example function")

    //Calling user defined function
    printNumber()

    //calling the parameterised functions
    sumTwoNumbers(10, 20)

    //calling the retuning function
    val result = multiplyTwoNumber(10, 20)
    print(result)

}

//user defined function
fun printNumber() {
    println(10)
}

// Function with parameters
fun sumTwoNumbers(num1: Int, num2: Int) {
    val sum = num1 + num2
    println(sum)
}

// Function with return type
fun multiplyTwoNumber(num1: Int, num2: Int): Int {
    val result = num1 * num2;
    return result
}