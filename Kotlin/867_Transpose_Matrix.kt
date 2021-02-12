class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val M = matrix.size
        val N = matrix[0].size
        val result = Array<IntArray>(N, {IntArray(M)})
        
        for(i in 0 until M){
            for(j in 0 until N){
                result[j][i] = matrix[i][j]
            }
        }
        
        return result
    }
}