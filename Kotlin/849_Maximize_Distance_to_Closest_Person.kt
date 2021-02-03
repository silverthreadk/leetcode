class Solution {
    fun maxDistToClosest(seats: IntArray): Int {
        var result = 0
        var s1 = -1
        var s2 = -1
        val n = seats.size
        for(i in 0 until n){
            if(seats[i] == 0) continue
            s1 = s2
            s2 = i
            if(s1 == -1) result = i
            else if(s1 >= 0 && s2 >= 0) result = maxOf(result, (s2 - s1) / 2)
        }
        if(seats[n - 1] == 0) result = maxOf(result, n - 1 - s2)
        
        return result
    }
}