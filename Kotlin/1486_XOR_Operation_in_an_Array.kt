class Solution {
    fun xorOperation(n: Int, start: Int): Int {
        var result = start
        for(i in 1 until n) {
            result = result xor (start + i * 2)
        }
        
        return result
    }
}