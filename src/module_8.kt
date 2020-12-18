fun main() {
    println(mult(2,2,2))
    println(sum(2,2,2))
    perim(4,5)
    funIt()
}

fun mult(a: Int, b: Int, c: Int): Int = a * b * c;

fun sum(a: Int, b: Int, c: Int): Boolean = a + b == c;

fun perim(a: Int, b: Int) {
    val area: (a: Int, b: Int) -> Int = { a, b -> a * b}
    println(area(a,b))
}

fun funIt() {
    val name: (name: String) -> String = {"Hello $it"}
    println(name("Sergo"))
}