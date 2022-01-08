class Solution {
    fun numTimesAllBlue(flips: IntArray): Int {
        var result = 0
        var prev = 0
        for(i in flips.indices) {
            prev = maxOf(prev, flips[i])
            if (i + 1 == prev) ++result
        }
        
        return result
    }
}