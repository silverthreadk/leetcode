class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        var num = 0
        var time = -1
        val q: Deque<Pair<Int, Int>> = ArrayDeque()
        
        grid.forEachIndexed { i, row ->
            row.forEachIndexed { j, col ->
                if(col == 1) {
                    ++num
                } else if(col == 2) {
                    q.offer(Pair(i, j))
                }
            }
        }
        
        if(num == 0) return 0

        while (q.isNotEmpty()) {
            ++time
            for (i in 0 until q.size) {
                val head = q.poll()
                val row = head.first
                val col = head.second
                
                if (row >= 1 && grid[row - 1][col] == 1) {
                    grid[row - 1][col] = 2
                    q.offer(Pair(row - 1, col))
                    --num
                }
                if (row < grid.size - 1 && grid[row + 1][col] == 1) {
                    grid[row + 1][col] = 2
                    q.offer(Pair(row + 1, col))
                    --num
                }
                if (col >= 1 && grid[row][col - 1] == 1) {
                    grid[row][col - 1] = 2
                    q.offer(Pair(row, col - 1))
                    --num
                }
                if (col < grid[0].size - 1 && grid[row][col + 1] == 1) {
                    grid[row][col + 1] = 2
                    q.offer(Pair(row, col + 1))
                    --num
                }
            }
        }

        return if (num == 0) time else -1
    }
}