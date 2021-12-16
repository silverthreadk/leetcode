class Solution {
    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1)
		
        for (i in 0..n) {
            result[i] = i % 2 + result[i / 2]
        }
		
        return result
    }
}