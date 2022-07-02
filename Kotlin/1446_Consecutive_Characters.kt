class Solution {
    fun maxPower(s: String): Int {
        var result = 1
        var count = 1
        
        for(i in 1 until s.length){
            if(s[i] == s[i-1]){
                ++count
            } else {
                result = maxOf(result, count)
                count = 1
            }
        }
        
        return maxOf(result, count)
    }
}