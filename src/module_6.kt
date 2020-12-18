fun main() {
    printAbc()
    println(isChar('a'))
}

fun printAbc() {
    val abc = charArrayOf('a','b','c','d','e','f')
    for(el in abc){
        println(" $el ")
    }
}

fun isChar(char: Char): Boolean {
    return char in 'A'..'z'
}