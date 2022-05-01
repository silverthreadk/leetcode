class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        var result = 0
        val visit = Array(grid.size) { BooleanArray(grid.first().size) }
        
        for(i in grid.indices){
            for(j in grid.first().indices){
                result = maxOf(result, recursive(i, j, grid, visit))
            }
        }
        
        return result
    }
    fun recursive(row:Int, col:Int, grid: Array<IntArray>, visit: Array<BooleanArray>):Int{
		if(row < 0 || col < 0 || row > grid.size - 1 || col > grid.first().size - 1 
           || visit[row][col] || grid[row][col] != 1) return 0
        
        var result = 0
        visit[row][col] = true
        
        result += recursive(row - 1, col, grid, visit)
        result += recursive(row + 1, col, grid, visit)
        result += recursive(row, col - 1, grid, visit)
        result += recursive(row, col + 1, grid, visit)
        
		return result + 1
	}
}