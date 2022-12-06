class Solution {
    fun reverse(x: Int): Int {
        var result = x % 10L
        var current = x / 10
        
        while(current != 0) {
            result = result * 10 + current % 10
            current /= 10
        }
        
        if (result <= Integer.MIN_VALUE || result >= Integer.MAX_VALUE) return 0
        
        return result.toInt()
    }
}