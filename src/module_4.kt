fun main() {
    strLen(null)
    strLen("empty")
}
fun strLen(str: String?) {
    println(str?.length ?: "Str is nul or empty")
}