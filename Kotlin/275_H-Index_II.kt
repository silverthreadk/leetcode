class Solution {
    fun hIndex(citations: IntArray): Int {
        val n = citations.size
        var lo = 0
        var hi = n - 1
        
        while(lo <= hi) {
            val mid = lo + (hi - lo) / 2

            if(citations[mid] == n - mid) return n - mid
            else if (citations[mid] < n - mid) lo = mid + 1
            else hi = mid - 1
        }
        
        return n - lo
    }
}