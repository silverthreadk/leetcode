class Solution {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        var result = 0
        val n = grid.size
        val row = IntArray(n)
        val col = IntArray(n)
        
        for(i in 0 until n){
            for(j in 0 until n){
                row[i] = maxOf(row[i], grid[i][j])
                col[j] = maxOf(col[j], grid[i][j])
            }
        }
        
        for(i in 0 until n){
            for(j in 0 until n){
                result += minOf(row[i], col[j]) - grid[i][j]
            }
        }
        
        return result
    }
}