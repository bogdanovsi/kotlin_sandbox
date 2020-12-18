fun main() {
    val p1 = Parrot()
    p1.nick = "nick"
    p1.age = 5_000
    println("Parror ${p1.nick} age: ${p1.age}")

    val p2 = Parrot()
    p2.nick = "Nick"
    p2.age = -15
    println("Parror ${p2.nick} age: ${p2.age}")
}

class Parrot {
    var nick: String = ""
        get() = field.capitalize()
    var age: Int = 0
        set(value) {
            field = if (value >= 0) {
                value
            } else {
                0
            }
        }
}