class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf(emptyList<Int>())
        nums.forEach { num ->
            val list = result.map { it + num }
            result.addAll(list)
        }
        
        return result
    }
}