class Solution {
    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size
        val result = Array(m) { IntArray(n) {Int.MAX_VALUE} }
        val q = LinkedList<Pair<Int, Int>>()
        
        for(i in mat.indices){
            for(j in mat[i].indices){
                if(mat[i][j] == 1) continue
                q.add(Pair(i, j))
                result[i][j] = 0
            }
        }
        
        while(q.isNotEmpty()){
            val size = q.size
            
            for(i in 0 until size){
                val (row, col) = q.remove()
                
                if(row + 1 < m && result[row + 1][col] > result[row][col] + 1) {
                    result[row + 1][col] = result[row][col] + 1
                    q.add(Pair(row + 1, col))
                }
                if(row - 1 >= 0 && result[row - 1][col] > result[row][col] + 1) {
                    result[row - 1][col] = result[row][col] + 1
                    q.add(Pair(row - 1, col))
                }
                if(col + 1 < n && result[row][col + 1] > result[row][col] + 1) {
                    result[row][col + 1] = result[row][col] + 1
                    q.add(Pair(row, col + 1))
                }
                if(col - 1 >= 0 && result[row][col - 1] > result[row][col] + 1) {
                    result[row][col - 1] = result[row][col] + 1
                    q.add(Pair(row, col - 1))
                }
            }
        }
        
        return result
    }
}