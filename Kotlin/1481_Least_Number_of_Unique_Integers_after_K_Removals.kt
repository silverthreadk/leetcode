class Solution {
    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
        val m = arr.asList().groupingBy { it }.eachCount()
        val sorted = m.values.sorted()
        
        var result = sorted.size
        var i = k
        for(count in sorted) {
            if(count > i) break
            else i -= count
            --result
        }
        
        return result
    }
}