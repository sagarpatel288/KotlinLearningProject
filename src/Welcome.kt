fun findAverage(values: IntArray): Double {
    var result = 0.0
    for (i in 0 until values.size) {
        result += values[i]
    }
    return result
}

fun main() {
    val array = intArrayOf(5, 6, 7, 8)
    println("AVERAGE of array " + array.joinToString() + " is " + findAverage(array))
}
