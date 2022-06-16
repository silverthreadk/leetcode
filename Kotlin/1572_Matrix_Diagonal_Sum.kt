class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var result = 0
        var n = mat.size
        
        for(i in mat.indices){
            result += mat[i][i]
            result += mat[i][n - 1 - i]
        }
        
        if(n and 1 == 1){
            result -= mat[n / 2][n / 2]
        }
        
        return result
    }
}