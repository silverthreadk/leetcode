class Solution {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val M = mat.size
        val N = mat[0].size
        var MN = 0
        val result = IntArray(M*N)
        var index = 0
        while(MN < M+N){
            if(MN and 1 == 1){
                val begin = maxOf(MN-N+1, 0)
                val end = minOf(MN, M-1)
                for(i in begin..end){
                    result[index++] = mat[i][MN-i]
                }
            } else {
                val begin = maxOf(MN-M+1, 0)
                val end = minOf(MN, N-1)
                for(i in begin..end){
                    result[index++] = mat[MN-i][i]
                }
            }
            
            ++MN
        }
        
        return result
    }
}