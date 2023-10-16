class Solution {
    fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
        intervals.sortWith(compareBy<IntArray>{ it[0] }.thenByDescending{ it[1] })

        var result = 1
        var index = 0
            
        for(i in intervals.indices){
            if(intervals[i][1] <= intervals[index][1]) continue
            ++result
            index = i
        }
        
        return result
    }
}