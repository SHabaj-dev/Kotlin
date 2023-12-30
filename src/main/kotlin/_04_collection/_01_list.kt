package _04_collection

fun main() {
    //immutable List
    val myList = listOf("Apple", "Mango", "Banana", "Orange")
//    println(myList)

    val myMutableList = mutableListOf("one", "two", "three", "four")
    myMutableList.add("five")
//    println(myMutableList)

    //Looping through List
    //1. through iterable
    /*val itr = myList.listIterator()
    while (itr.hasNext()) {
        println(itr.next())
    }*/

    //using For each Loop
    myList.forEach { println(it) }
}