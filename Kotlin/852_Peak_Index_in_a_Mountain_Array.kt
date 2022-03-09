class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var lo = 0
        var hi = arr.lastIndex
        
        while(lo < hi){
            val mid = (lo + hi) / 2
            if(arr[mid] < arr[mid + 1]) lo = mid + 1
            else hi = mid
        }
        
        return lo
    }
}