class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var result = 0
        val frequency = IntArray(128) {0}
        
        jewels.forEach {
            frequency[it.toInt()] += 1
        }
        stones.forEach {
            result += frequency[it.toInt()]
        }
        
        return result
    }
}