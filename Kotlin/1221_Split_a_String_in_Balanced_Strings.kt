class Solution {
    fun balancedStringSplit(s: String): Int {
        var result = 0
        var balance = 0;
        
        for(c in s){
            if(c == 'R') ++balance
            if(c == 'L') --balance
            if(balance == 0) ++result
        }
        
        return result
    }
}