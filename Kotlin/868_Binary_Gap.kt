class Solution {
    fun binaryGap(n: Int): Int {
        var result = 0
        var current = n
        var prev = -1
        var i = 0
        while(current != 0){
            if(current % 2 == 1) {
                result = if(prev == -1) 0 else maxOf(result, i - prev)
                prev = i
            }
            ++i
            current /= 2
        }
        
        return result
    }
}