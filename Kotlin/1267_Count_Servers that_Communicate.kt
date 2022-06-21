class Solution {
    fun countServers(grid: Array<IntArray>): Int {
        var result = 0
        val m = grid.size
        val n = grid[0].size
        val row = IntArray(m)
        val col = IntArray(n)
        
        for(i in 0 until m){
            for(j in 0 until n){
                if(grid[i][j] == 0) continue
                ++row[i]
                ++col[j]
            }
        }
        
        for(i in 0 until m){
            for(j in 0 until n){
                if(grid[i][j] == 0
                  || (row[i] < 2 && col[j] < 2)) continue
                ++result
            }
        }
        
        return result
    }
}