class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val m = matrix.size
        val n = matrix[0].size
        val result = mutableListOf<Int>()
        
        var row = 0
        var col = 0
        var step = 0
        var dir = if(n == 1) 1 else 0
        val d = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))
        
        for(i in 0 until m * n){
            result.add(matrix[row][col])
            row += d[dir][0]
            col += d[dir][1]
            if ((dir == 0 && col == n - step - 1)
                || (dir == 1 && row == m - step - 1)
                || (dir == 2 && col == step)
                || (dir == 3 && row == step)){
                dir = (dir + 1) % 4
                if(dir == 3) ++step
            }
        }
        
        return result
    }
}