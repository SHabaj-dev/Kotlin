package _01_basic

/*
    Arrays are used to store multiple items of the same data type in a single variable, such as integer or string under
    as single variable
 */
fun main() {
    val fruits = arrayOf("Apple", "Banana", "Mango", "Orange")
    println(fruits.contentToString())

    val cars = arrayOfNulls<String>(10)
    cars[0] = "Someone"
    println(cars.contentToString())
    println("Array is Empty: " + cars.isEmpty())

    val a = 1..10
    val f = a.filter { it % 2 == 0 }
    println(f)

}