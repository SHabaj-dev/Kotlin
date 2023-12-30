package _05_oop_s

class FirstClass {
    val name = "Shabaj"
    val age = 19

    fun printUserData() {
        print("Name: ${this.name} \n Age: ${this.age} ")
    }
}

fun main() {
    val firstObject = FirstClass()
    firstObject.printUserData()
}