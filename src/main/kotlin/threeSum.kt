import java.util.*

class Solution {
    companion object {
        fun threeSum(nums: IntArray, target: Int = 0): List<List<Int>> {
            val normalizeThrehold = nums.last { it < 0 } * -1
            val normalizedNums = nums.map { it + normalizeThrehold }
            val results = mutableListOf<List<Int>>()
            val twoNumSum = mutableMapOf<List<Int>, Int>() // [1,2] = 3 , [6, 7] = 13
            var pointer = -1

            // n^2
            normalizedNums.forEachIndexed { index, value ->
                normalizedNums.forEachIndexed { moveIndex, moveValue ->
                    // only check >= index + 1
                    if (index != moveIndex && moveIndex > pointer) {
                        twoNumSum.put(
                            listOf(value - normalizeThrehold, moveValue - normalizeThrehold),
                            value + moveValue - normalizeThrehold - normalizeThrehold
                        )
                    }
                }
                pointer++
                // n^2
            }

            // n^2
            twoNumSum.forEach { keys, value ->
                nums.forEach { complement ->
                    if (target - value == complement) {
                        val dirtyResult = (keys + complement).sorted()
                        results.add(dirtyResult)
                    }
                }
            }
////            System.out.println(twoNumSum.toList())
//            results.forEach {
//                System.out.println(Arrays.toString(it))
//            }
            return results
        }
    }
}

fun main(args: Array<String>) {
    val result = Solution.threeSum(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2, -3).toIntArray())
    print(result.toList())
}