class Solution {
    fun change(amount: Int, coins: IntArray): Int {
        val dp = IntArray(amount + 1) { 0 }
        dp[0] = 1
        for(i in 0 until coins.size){ 
            for(j in coins[i]..amount){
                dp[j] += dp[j - coins[i]]
            }
        }
        
        return dp[amount]
    }
}