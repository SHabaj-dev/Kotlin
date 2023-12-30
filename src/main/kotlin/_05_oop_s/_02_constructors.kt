package _05_oop_s

class Person(val _name: String, val _age: Int) {
    val name: String
    val age: Int

    init {
        println("Inside init")
        this.name = _name
        this.age = _age
    }

    public fun printInfo() {
        println("Name: ${this.name}, Age: ${this.age}")
    }
}

fun main() {
    val person1 = Person("Shabaj", 12)
    person1.printInfo()
}