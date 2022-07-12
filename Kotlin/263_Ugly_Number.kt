class Solution {
    fun isUgly(n: Int): Boolean {
        if(n < 1) return false
        
        var current = n
        
        while(current > 1){
            if(current % 2 == 0) current /= 2
            else if(current % 3 == 0) current /= 3
            else if(current % 5 == 0) current /= 5
            else return false
        }
        
        return true
    }
}