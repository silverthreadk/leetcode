class Solution {
    fun numSubarraysWithSum(A: IntArray, S: Int): Int {
        var result = 0
        val count = hashMapOf<Int, Int>()
        var sum = 0
        
        for(i in 0 until A.size) {
            sum += A[i]
            if(sum - S >= 0) result += count.getOrDefault(sum - S, 0)
            if(sum == S) ++result
            count[sum] = count.getOrDefault(sum, 0) + 1
        }
        
        return result
    }
}