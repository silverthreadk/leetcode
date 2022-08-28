class Solution {
    fun countVowelStrings(n: Int): Int {
        var dp = IntArray(5) {1}
        
        for(i in 1 until n){
            for(j in 1 until 5){
                dp[j] += dp [j - 1]
            }
        }
        
        return dp.sum()
    }
}