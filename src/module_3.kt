import java.util.*

fun main() {
    getName();
    compareNumber()
    getEven(3,4)
    getWeekDay()
    guessNum()
}

fun getName(){
    val scan = Scanner(System.`in`)
    println("Enter name:")
    val name: String = scan.nextLine().trim()
    println("Enter age:")
    val age: Int = scan.nextInt()
    println("Hello, $name. Old: $age")
}

fun compareNumber() {
    val scan = Scanner(System.`in`)
    val fn = 10
    val sn = 20
    println("Enter first num: ")
    val first: Int = scan.nextInt()
    println("Enter second num: ")
    val second: Int = scan.nextInt()
    when {
        first > fn -> println(">")
        first < fn -> println("<")
        first == fn -> println("==")
    }
    when {
        second > sn -> println(">")
        second < sn -> println("<")
        second == sn -> println("==")
    }
}

fun getEven(a: Int, b: Int) {
    if(a % 2 == 0) println(a) else println(b)
}

fun getWeekDay() {
    val scan = Scanner(System.`in`)
    println("Enter day: ")
    when(scan.nextInt()){
        1 -> println("Mon")
        2 -> println("Tues")
        3 -> println("Wed")
        4 -> println("Thurs")
        5 -> println("Fri")
        6 -> println("Sat")
        7 -> println("Sun")
        else -> println("else")
    }
}

fun guessNum() {
    val scan = Scanner(System.`in`)
    val guessNum = 4
    println("Guess the number:")
    while (guessNum != scan.nextInt()) {
        println("Nop")
    }
    println("Yep")
}