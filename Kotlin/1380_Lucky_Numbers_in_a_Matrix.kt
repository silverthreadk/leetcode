class Solution {
    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
        val result = mutableListOf<Int>()
        val m = matrix.size
        val n = matrix[0].size
        
        for(i in 0 until m) {
            var minimum = Int.MAX_VALUE
            var index = 0
            for(j in 0 until n) {
                if(minimum > matrix[i][j]){
                    minimum = matrix[i][j]
                    index = j
                }
            }
            var maximum = minimum
            for(j in 0 until m) {
                maximum = maxOf(maximum, matrix[j][index])
            }
            
            if(minimum == maximum) {
                result.add(minimum)
            }
        }
        
        return result
    }
}