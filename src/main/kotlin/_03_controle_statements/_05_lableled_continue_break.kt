package _03_controle_statements

fun main() {

    outerLoop@ for (i in 1..10) {
        innerLoop@ for (j in 1..i) {
            if (j == i * 2) {
                break@outerLoop
            }
            println("value of i $i and value of j $j")
        }
    }

}