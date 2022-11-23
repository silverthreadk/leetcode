class Solution {
    fun secondHighest(s: String): Int {
        var result = -1
        var largestNum = -1
        
        for(ch in s) {
            if(!ch.isDigit()) continue
            if(largestNum < ch - '0') {
                result = largestNum
                largestNum = ch - '0'
            } else if(largestNum > ch - '0' && result < ch - '0') {
                result = ch - '0'
            }
        }
        
        return result
    }
}