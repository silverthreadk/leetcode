class Solution {
    fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        val result = ArrayList<IntArray>()
        var i = 0
        var j = 0
        
        while(i < firstList.size && j < secondList.size){
            var lo = maxOf(firstList[i][0], secondList[j][0])
            var hi = minOf(firstList[i][1], secondList[j][1])
            if(lo <= hi){
                result.add(intArrayOf(lo, hi))
            }
            if(firstList[i][1] < secondList[j][1]) ++i
            else ++j
        }
        
        return result.toTypedArray()
    }
}