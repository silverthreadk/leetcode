class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        var minDifference = Int.MAX_VALUE
        
        arr.sort()
        for (idx in 0 until arr.lastIndex) {
            val diff = arr[idx + 1] - arr[idx]

            if (diff < minDifference) {
                result.clear()
                minDifference = diff
            }
            
            if (diff == minDifference) {
                result.add(listOf(arr[idx], arr[idx + 1]))
            }
        }

        return result
    }
}