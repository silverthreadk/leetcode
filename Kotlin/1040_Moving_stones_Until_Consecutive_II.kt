class Solution {
    fun numMovesStonesII(stones: IntArray): IntArray {
        stones.sort()
        val n = stones.size
        var max_move = Math.max(stones[n-1] - stones[1],  stones[n-2] - stones[0]) - n + 2
        
        if ((stones[n-1] - stones[0] != n && stones[n-2] - stones[0] == n - 2) xor (stones[n-1] - stones[1] == n - 2)) {
            return intArrayOf(2, max_move)
        }
        
        var max_count = 0
        stones.forEachIndexed { i, stone ->
            var count = 0
            for(j in i..n-1) {
                if(stones[j] >= stone + n) break
                count += 1
            }
            max_count = Math.max(max_count, count)
        }
        
        val min_move = n - max_count
        
        return intArrayOf(min_move, max_move)
    }
}