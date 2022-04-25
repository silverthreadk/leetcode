class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val result = MutableList(1){1}
        
        for(i in 1..rowIndex){
            result.add(1)
            for(j in i - 1 downTo 1){
                result.set(j, result[j] + result[j - 1])
            }
        }
        
        return result
    }
}