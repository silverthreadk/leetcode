class Solution {
    fun brokenCalc(startValue: Int, target: Int): Int {
        var result = 0
        var current = target
        
        while(current > startValue){
            if(current % 2 == 1){
                ++result
                ++current
            }
            ++result
            current /= 2
        }
        result += (startValue - current)
        
        return result
    }
}