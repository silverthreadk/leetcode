class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val result = ArrayList<IntArray>()
        
        intervals.sortWith(Comparator { a, b -> a[0].compareTo(b[0]) })
        result.add(intervals[0])
        
        for (i in 1 until intervals.size) {
            if (intervals[i][0] <= result.last()[1]) result.last()[1] = maxOf(result.last()[1], intervals[i][1])
            else result.add(intervals[i])
        }

        return result.toTypedArray()
    }
}