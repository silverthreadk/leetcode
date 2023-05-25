class Solution {
    fun maxDistance(grid: Array<IntArray>): Int {
        var result = -1
        val q = LinkedList<Pair<Int,Int>>()
        val visited =  Array(grid.size) {Array(grid[0].size) {false} }

        for(i in grid.indices){
            for(j in grid.indices) {
                if(grid[i][j] == 0) continue
                q.add(i to j)
                visited[i][j] = true
            }
        }
        if(q.size == grid.size * grid.size) return result
        
        while(q.isNotEmpty()) {
            ++result
            val n = q.size

            for(i in 0 until n) {
                val (y, x) = q.poll()                
                if(y > 0 && !visited[y - 1][x]) {
                    visited[y - 1][x] = true
                    q.add(y - 1 to x)
                }
                if(y < grid.size - 1 && !visited[y + 1][x]) {
                    visited[y + 1][x] = true
                    q.add(y + 1 to x)
                }
                if(x > 0 && !visited[y][x - 1]) {
                    visited[y][x - 1] = true
                    q.add(y to x - 1)
                }
                if(x < grid.size - 1 && !visited[y][x + 1]) {
                    visited[y][x + 1] = true
                    q.add(y to x + 1)
                }
            }
        }
        
        return result
    }
}