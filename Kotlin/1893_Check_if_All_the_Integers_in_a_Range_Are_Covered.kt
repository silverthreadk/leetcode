class Solution {
    fun isCovered(ranges: Array<IntArray>, left: Int, right: Int): Boolean {
        val dp = IntArray(52)
        for (range in ranges) {
            ++dp[range[0]]
            --dp[range[1] + 1]
        }

        for(i in 1 until 52) {
            dp[i] += dp[i - 1]
        }

        for(i in left..right) {
            if(dp[i] == 0) return false
        }

        return true
    }
}