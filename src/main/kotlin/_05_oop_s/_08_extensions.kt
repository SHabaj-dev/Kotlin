package _05_oop_s

class Temperature {
    fun myPrintFunction() {
        println("This is member function of Temperature class")
    }
}

fun main() {
    val temp = Temperature()
    temp.myPrintFunction()
    temp.myExtensionFunction()

    //This is example of Extended Library Class Example
    val myString = "This Is an example String"
    println(myString.countVowels())
}

fun Temperature.myExtensionFunction() {
    println("This is Extension Function")
}

fun String.countVowels(): Int {
    var vowel = 0
    for (element in this.lowercase()) {
        if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u') {
            ++vowel
        }
    }
    return vowel
}