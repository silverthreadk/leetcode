class Solution {
    fun maximumSum(arr: IntArray): Int {
        var result = arr[0]
        var deleted = 0
        var notDeleted = arr[0]
        
        for(i in 1 until arr.size) {
            deleted = maxOf(notDeleted, deleted + arr[i])
            notDeleted = maxOf(notDeleted + arr[i], arr[i])
            result = maxOf(result, maxOf(deleted, notDeleted))
        }
        
        return result
    }
}