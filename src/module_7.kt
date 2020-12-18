import kotlin.math.abs

fun main() {
    println(compNumbers(2, 4))
    varargs(4,5,3,2)
}

fun compNumbers(a: Int, b: Int, flag: Boolean = false): Int {
    if (flag) {
        return minOf(abs(a), abs(b))
    } else {
        return minOf(a, b)
    }
}

fun varargs(vararg numbers: Int) {
    numbers.forEach { num -> println("number: $num") }
}