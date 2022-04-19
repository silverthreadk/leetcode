class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat[0].size != r * c) return mat
        
        val result = Array(r) { IntArray(c) }
        var i = 0
        mat.forEach{ row ->
            row.forEach{ col ->
                result[i / c][i % c] = col
                ++i
            }
        }
        
        return result
    }
}