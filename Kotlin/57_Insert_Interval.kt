class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val result = ArrayList<IntArray>()
        var temp = newInterval

        for(interval in intervals){
            if(temp[0] > interval[1]){
                result.add(interval)
            } else if(temp[1] < interval[0]){
                result.add(temp)
                temp = interval
            } else if(temp[0] <= interval[1] || temp[1] >= interval[0]){
                temp[0] = minOf(temp[0], interval[0])
                temp[1] = maxOf(temp[1], interval[1])
            }
        }
        result.add(temp);

        return result.toTypedArray()
    }
}