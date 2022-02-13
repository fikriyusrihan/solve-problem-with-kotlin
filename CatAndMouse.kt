import kotlin.math.abs

fun main() {
    println(catAndMouse(1,3,2))
}

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val catAToMouse = abs(x - z)
    val catBToMouse = abs(y - z)

    return when {
        catAToMouse == catBToMouse -> {
            "Mouse C"
        }
        catAToMouse > catBToMouse -> {
            "Cat B"
        }
        else -> {
            "Cat A"
        }
    }
}