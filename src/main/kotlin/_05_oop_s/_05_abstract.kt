package _05_oop_s

abstract class Animal {
    open fun walking(animalName: String) {
        println("$animalName is walking")
    }

    abstract fun sound()
}

class Cat(animalName: String) : Animal() {
    val animalName: String

    init {
        this.animalName = animalName
    }

    fun walking() {
        super.walking(animalName)
    }

    override fun sound() {
        println("$animalName is making sound")
    }
}

fun main() {
    val cat = Cat("Cat")
    cat.walking()
    cat.sound()
}