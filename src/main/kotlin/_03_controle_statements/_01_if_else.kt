package _03_controle_statements

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val age = sc.nextInt()
    val legalAge = 18

    /*if (age >= 18) {
        println("You are eligible for voting")
    } else {
        println("your not eligible for voting")
    }*/

    val result = if (age >= legalAge) "You are eligible" else "you are not eligible"
    println(result)

}