import java.util.*

fun main() {
    createArr()
    sortArr()
}

fun createArr() {
    val arr = mutableListOf<Int>()
    val scan = Scanner(System.`in`)
    println("Enter len arr")
    val len: Int = scan.nextInt()
    for (x: Int in 0 until len) {
        print("enter num arr[${x+1}]: ")
        val num = scan.nextInt()
        arr.add(num)
    }

    println(arr)
}

fun sortArr() {
    val intArr = intArrayOf(5, -20, 40, -50, 22, 4, 7)
    intArr.sort()
    intArr.forEach { i -> print(" $i ") }
}