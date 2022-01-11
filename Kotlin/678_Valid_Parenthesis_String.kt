class Solution {
    fun checkValidString(s: String): Boolean {
        var minOpen = 0
        var maxOpen = 0
        
        for(ch in s){
            if(ch == '('){
                ++minOpen
                ++maxOpen
            } else if(ch == ')') {
                --minOpen
                --maxOpen
            } else {
                --minOpen
                ++maxOpen
            }
            
            if(maxOpen < 0) return false
            
            minOpen = maxOf(minOpen, 0)
        }

        return minOpen == 0
    }
}