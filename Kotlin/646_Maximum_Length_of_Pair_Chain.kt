class Solution {
    fun findLongestChain(pairs: Array<IntArray>): Int {
        var result = 0
        val n = pairs.size
        var current = Int.MIN_VALUE
        
        Arrays.sort(pairs){ a, b ->
            a[1] - b[1]
        }
        
        for(i in 0 until n){
            if(current >= pairs[i][0]) continue
            current = pairs[i][1]
            ++result
        }
        
        return result
    }
}