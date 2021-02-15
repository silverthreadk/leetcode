class Solution {
    fun sumSubseqWidths(A: IntArray): Int {
        var result = 0L
        A.sort()
        val n = A.size
        var p = 1L
        for(i in 0 until n){
            result = ((result + (A[i] - A[n-1-i]) * p) % (1e9 + 7)).toLong()
            p = ((p * 2) % (1e9 + 7)).toLong()
        }

        return result.toInt()
    }
}