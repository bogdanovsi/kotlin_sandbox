fun main() {
    val p = Plane(453, 12512)
    println("${p.places} ${p.year} ${p.model}")

    val v = Vehicle("easy", 1995, "S")
    v.printInfo()
}

class Plane(_places: Int, _year: Int) {
    var places: Int
    val year: Int
    var model: String? = null

    init {
        places = _places
        year = _year
    }

    constructor(_places: Int, _year: Int, _model: String?): this(_places, _year) {
        model = _model
    }
}

fun Vehicle.printInfo() {
    println("Type: ${this.type}, year: ${this.year}, model: ${this.model}")
}

class Vehicle(var type: String, val year: Int, var model: String) {}