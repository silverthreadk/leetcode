class Solution {
    fun longestSubsequence(arr: IntArray, difference: Int): Int {
        var result = 1
        val count = HashMap<Int, Int>()
        
        for(num in arr){
            count.put(num, count.getOrDefault(num - difference, 0) + 1)
            result = maxOf(result, count[num]!!)
        }
        
        return result
    }
}