class Solution {
    fun decrypt(code: IntArray, k: Int): IntArray {
        val n = code.size
        val result = IntArray(n)
        if (k == 0) return result
        
        var key = k
        var offset = n - 1
        if(k < 0){
            key = -k
            offset = key
        }
        
        var sum = code.filterIndexed{ index, _ ->  index < key }.sum()
        result[offset] = sum
        
        for(i in 0 until n - 1){
            sum -= code[i]
            sum += code[(i + key) % n]
            result[(offset + 1 + i) % n] = sum
        }
        
        return result
    }
}