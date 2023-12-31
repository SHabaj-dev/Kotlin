package _05_oop_s

/*
There are four types of access modifiers in kotlin
    - public -> Accessible from anywhere
    -private -> Can access outside its scope
    -protected -> visible to the class itself and its subclass only
    -internal -> visible inside same module but not outside
 */

open class A() {
    internal val i = 1

    internal fun doSomething() {
        println("Inside doSomething")
        println("Value of i is $i")
    }
}

class B : A() {
    fun printValue() {
        doSomething()
        println("Value of i is $i")
    }
}

fun main(args: Array<String>) {
    val a = A()
    val b = B()

    a.doSomething()

    b.printValue()
}  