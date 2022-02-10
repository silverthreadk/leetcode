class Solution {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        var result = 0
        var odd = 0
        val count = HashMap<Int,Int>()
        count[0] = 1
        
        nums.forEach{
            odd += it % 2
            result += count.get(odd - k) ?: 0
            count.merge(odd, 1, Int::plus)
        }
        
        return result
    }
}