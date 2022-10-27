class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var result = 0
        var altitude = 0
        
        for(i in gain) {
            altitude += i
            result = maxOf(result, altitude)
        }
        
        return result
    }
}