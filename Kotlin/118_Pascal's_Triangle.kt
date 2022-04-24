class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        
        for(i in 0 until numRows) {
            val temp = ArrayList<Int>()
            for(j in 0..i) {
                if(j == 0) temp.add(1)
                else if(j == i)temp.add(1)
                else temp.add(result[i - 1][j - 1] + result[i - 1][j])
            }
            result.add(temp)
        }
        
        return result
    }
}