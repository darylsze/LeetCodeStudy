fun numJewelsInStones(jewelTypes: String, stones: String): Int {
    return stones.filter { it in jewelTypes }.count()
}

fun main(args: Array<String>) {
    println(numJewelsInStones("aAbB", "aAbBaAbBC"))
}