package _01_basic

/* -main function is the entry point of out program in kotlin
   -main function can be also contains arguments eg: fun main(args: Array<String>){}
 */
fun main() {
    val message = "Hello World"
    message.printWithPrefix("Greetings:")
}

fun String.printWithPrefix(prefix: String) {
    println("$prefix $this")
}