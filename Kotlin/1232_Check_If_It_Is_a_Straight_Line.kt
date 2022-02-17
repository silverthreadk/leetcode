class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        for(i in 2 until coordinates.size) {
            if(getDiffX(coordinates[i], coordinates[i-1]) * getDiffY(coordinates[i-1], coordinates[i-2])
               != getDiffY(coordinates[i], coordinates[i-1]) * getDiffX(coordinates[i-1], coordinates[i-2])) return false
        }
        
        return true
    }
    
    fun getDiffX(p1: IntArray, p2: IntArray): Int {
        return p1[0] - p2[0]
    }
    
    fun getDiffY(p1: IntArray, p2: IntArray): Int {
        return p1[1] - p2[1]
    }
}