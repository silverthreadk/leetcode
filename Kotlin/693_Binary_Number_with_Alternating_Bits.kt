class Solution {
    fun hasAlternatingBits(n: Int): Boolean {
        var previous = n % 2
        var i = n / 2
        while(i>0){
            val remainder = i % 2
            if(previous == remainder) return false
            previous = remainder
            i = i / 2
        }
        
        return true
    }
}