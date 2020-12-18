fun main() {
    println(7.isPrime())
    println(8.isPrime())
    println(11.isPrime())
}

fun Int.isPrime(): Boolean {
    for(n in 2 until this) if (this % n == 0) return false

    return true
}