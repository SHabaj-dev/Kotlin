package _05_oop_s

open class ABC {

    open val myNumber = 10
    open fun printFunction() {
        println("This is Print function 1")
    }
}

class CBA : ABC() {

    override var myNumber: Int = 12
    override fun printFunction() {
        println("this is child class ${this.myNumber} + ${super.myNumber}")
    }


}

fun main() {
    val a = CBA()
    a.printFunction()
}