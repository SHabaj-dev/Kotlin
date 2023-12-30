package _03_controle_statements

fun main() {

    var number = 10;

    for (i in 1.rangeTo(10)) {
        if (i == 5)
            break

        println(i)
    }

    for (i in 1.rangeTo(10)) {
        if (i == 5)
            continue
        println(i)
    }


}