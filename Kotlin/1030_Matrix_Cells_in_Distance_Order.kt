class Solution {
    fun allCellsDistOrder(rows: Int, cols: Int, rCenter: Int, cCenter: Int): Array<IntArray> {
        val result = Array (rows * cols) { IntArray(2) }
        val visit = Array(rows) { BooleanArray(cols) }
        val q = LinkedList<Pair<Int,Int>>()

        q.push(Pair(rCenter, cCenter))
        
        var index = 0
        while(!q.isEmpty()) {
            val cell = q.remove()
            if (visit[cell.first][cell.second]) continue
            
            result[index][0] = cell.first
            result[index++][1] = cell.second
            
            visit[cell.first][cell.second] = true
            
            if(cell.first - 1 >= 0 && !visit[cell.first - 1][cell.second]) q.add(Pair(cell.first - 1, cell.second))
            if(cell.first + 1 < rows && !visit[cell.first + 1][cell.second]) q.add(Pair(cell.first + 1, cell.second))
            if(cell.second - 1 >= 0 && !visit[cell.first][cell.second - 1]) q.add(Pair(cell.first, cell.second - 1))
            if(cell.second + 1 < cols && !visit[cell.first][cell.second + 1]) q.add(Pair(cell.first, cell.second + 1))
        }
        
        return result
    }
}