fun main() {
    val air = AirBus(15)
    val boe = Boeing(true)
    val arr = arrayOf(air, boe)
    for (a in arr) {
        a.printInfo()
    }
}

open class Airplane(val _name: String, val _year: Int, val _amount: Int) {
    open fun printInfo() {
        println(_name)
    }
}

class AirBus(_amount: Int): Airplane("AirBus", 25, _amount) {
    override fun printInfo() {
        println("Компания: $_name")
        println("Общее количество самолетов: $_amount")
    }
}

class Boeing(private val _isConcurent: Boolean): Airplane("Boeing", 28, 124) {
    override fun printInfo() {
        println("Компания: $_name")
        println("Является ли конкурентом: ${if(_isConcurent) "Да" else "Нет"}")
    }
}