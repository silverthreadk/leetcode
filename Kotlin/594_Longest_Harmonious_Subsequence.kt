class Solution {
    fun findLHS(nums: IntArray): Int {
        var result = 0
        val frequency = mutableMapOf<Int, Int>()
        nums.forEach{
            frequency[it] = frequency.getOrDefault(it, 0) + 1
        }
        
        frequency.forEach{
            if(frequency.containsKey(it.key + 1)) {
                result = maxOf(result, it.value + frequency[it.key + 1]!!)
            }
        }

        return result
    }
}