class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount == 0) return 0
        
        val dp = IntArray(amount + 1){amount + 1}
        dp[0] = 0
        
        for (i in coins.indices){
            if (coins[i] > amount) continue
            for (j in coins[i]..amount){
                dp[j] = minOf(dp[j], dp[j - coins[i]] + 1)
            }
        }
        
        return if(dp[amount] > amount) -1 else dp[amount]
    }
}