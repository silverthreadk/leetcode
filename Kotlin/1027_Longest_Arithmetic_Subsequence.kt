class Solution {
    fun longestArithSeqLength(A: IntArray): Int {
        var result = 0
        val freq = Array(A.size + 1) { HashMap<Int, Int>() }
        
        for(i in 0 until A.size){
            freq[i] = hashMapOf<Int, Int>()
            for(j in 0 until i){
                val diff = A[i] - A[j]
                freq[i][diff] = freq[j].getOrDefault(diff, 1) + 1
                result = maxOf(result, freq[i][diff]!!)
            }
        }
        
        return result
    }
}