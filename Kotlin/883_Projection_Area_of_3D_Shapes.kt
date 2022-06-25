class Solution {
    fun projectionArea(grid: Array<IntArray>): Int {
        var result = 0
        var n = grid.size
        
        for(i in 0 until n){
            var xz = 0
            var yz = 0
            for(j in 0 until n){
                result += if(grid[i][j] > 0) 1 else 0
                xz = maxOf(xz, grid[i][j])
                yz = maxOf(yz, grid[j][i])
            }
            result += xz + yz
        }
        
        return result
    }
}