class Solution {
    fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
        var result = keysPressed[0]
        var maxTime = releaseTimes[0]
        for(i in 1 until releaseTimes.size){
            val time = releaseTimes[i] - releaseTimes[i - 1]
            if(time < maxTime) continue
            else if(time == maxTime && keysPressed[i] < result) continue
            
            maxTime = time
            result = keysPressed[i]
        }
        
        return result
    }
}