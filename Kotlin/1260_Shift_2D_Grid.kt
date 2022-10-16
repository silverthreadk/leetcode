class Solution {
    fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        val m = grid.size
        val n = grid[0].size
        val result = MutableList(m) {MutableList(n) {0}}

        for(i in 0 until m){
            for(j in 0 until n){
                val row = (i + (j + k) / n) % m
                val col = (j + k) % n
                result[row][col] = grid[i][j]
            } 
        }
        
        return result
    }
}