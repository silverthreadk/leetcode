class Solution {
    fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)
        val dp = IntArray(arr.count() + 1)
        
        for(i in 0 until arr.count()){
            dp[i + 1] = dp[i].xor(arr[i])
        }
        
        for(i in 0 until queries.count()){
            result[i] = dp[queries[i][1] + 1].xor(dp[queries[i][0]])

        }
        
        return result
    }
}