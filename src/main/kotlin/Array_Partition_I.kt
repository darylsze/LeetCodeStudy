import kotlin.math.min

fun main(args: Array<String>) {
    val nums = mutableListOf<Int>(1, 2, 3, 4)
    val result = nums.sorted().chunked(2).sumBy { it.first() }
    println(result)
}

fun List<Int>.groupToPair(): List<List<Int>> {
    return this.chunked(2)
}