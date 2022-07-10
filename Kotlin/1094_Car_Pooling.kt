class Solution {
    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
        val time = IntArray(1001)
        var seats = 0
        
        for(trip in trips){
            time[trip[1]] += trip[0]
            time[trip[2]] -= trip[0]
        }
        
        for(t in time){
            seats += t
            if(seats > capacity) return false
        }
        
        return true
    }
}