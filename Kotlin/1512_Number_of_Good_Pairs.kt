class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var result = 0
        val m = mutableMapOf<Int, Int>()
        
        nums.forEach {
            m.put(it, m.getOrDefault(it, 0) + 1)
        }

        m.forEach { (key, value) ->
            result += (value * (value - 1)) / 2
        }
        
        return result
    }
}