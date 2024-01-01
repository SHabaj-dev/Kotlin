package _05_oop_s

fun main() {
    val tile: Tile = Red("Flame", 20)

    val points = when (tile) {
        is Red -> tile.points * 2
        is Blue -> tile.points * 5
    }

    println(points)

}

sealed class Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val type: String, val points: Int) : Tile()