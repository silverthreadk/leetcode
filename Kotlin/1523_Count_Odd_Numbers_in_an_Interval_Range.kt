class Solution {
    fun countOdds(low: Int, high: Int): Int {
        if((low and 1 == 1) || (high and 1 == 1)){
            return (high - low) / 2 + 1
        }
        
        return (high - low) / 2
    }
}