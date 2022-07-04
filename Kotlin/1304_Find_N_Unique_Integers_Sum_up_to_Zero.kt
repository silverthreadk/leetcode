class Solution {
    fun sumZero(n: Int): IntArray {
        val result = IntArray(n)
        
        for(i in 0 until n/2){
            result[i * 2] = i + 1
            result[i * 2 + 1] = -i - 1
        }
        
        return result
    }
}