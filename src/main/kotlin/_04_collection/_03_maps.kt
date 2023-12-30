package _04_collection

fun main() {
    val theMaps = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(theMaps)

    val theMutableMaps = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    println(theMutableMaps["one"])

    //Creating HashMap
    val myHashMap: HashMap<String, Int> = hashMapOf(Pair("One", 1), Pair("Two", 2), Pair("Three", 3))
    println(myHashMap)
}