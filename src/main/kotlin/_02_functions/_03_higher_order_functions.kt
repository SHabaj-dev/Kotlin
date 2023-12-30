package _02_functions

/*
A higher order function is a function that takes another function as parameter and/or returns a function
 */
fun main() {
    val result = operateOnNumbers(::addTwoNumber)
//    println(result)

    /*val multiplyByTwo = multiplyBy(2)
    val multiplyByThree = multiplyBy(3)

    println("Multiply by two: ${multiplyByTwo(5)}")
    println("Multiply by two: ${multiplyByThree(5)}")*/

    //Using function reference
    /*val number = listOf(1, 2, 3, 4, 5)
    val squaredNumber = number.map(::square)
    println(squaredNumber)*/

    val number = listOf(1, 2, 3, 4, 5)
    //Filter: Get only even Number
    val evenNumber = number.filter(::isEven)

    //Reduce: Find the sum of all Numbers
    val sumResult = number.reduce(::sum)

    println(sumResult)

}

//1. Passing function as parameters

fun operateOnNumbers(operation: (Int, Int) -> Int): Int {
    val number1 = 10
    val number2 = 20
    return operation(number1, number2)
}

fun addTwoNumber(num1: Int, num2: Int): Int {
    return num1 + num2
}

//2. Returning Functions
fun multiplyBy(factor: Int): (Int) -> Int {
    fun multiply(x: Int): Int {
        return x * factor
    }
    return ::multiply
}

//3. Using Function Reference

fun square(x: Int): Int {
    return x * x
}

//4. Basic Collection operations

fun isEven(x: Int): Boolean {
    return x % 2 == 0
}

fun sum(acc: Int, num: Int): Int {
    println("Value of acc: $acc")
//    println("Value of num: $num")
    return acc + num
}