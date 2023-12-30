package _05_oop_s

class Car {

    lateinit var name: String
    lateinit var brand: String
    lateinit var maxSpeed: String

    constructor(_name: String, _brand: String) {
        this.name = _name
        this.brand = _brand
    }

    constructor(_name: String, _brand: String, _maxSpeed: String) {
        this.name = _name
        this.brand = _brand
        this.maxSpeed = _maxSpeed
    }

}

fun main() {
    val bmwCar = Car("M5", "BMW")
    val amgCar = Car("G65", "AMG", "360")

    println(amgCar.name)
    println("${bmwCar.brand} ${bmwCar.name}")
}