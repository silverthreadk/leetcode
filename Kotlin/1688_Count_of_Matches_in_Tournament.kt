class Solution {
    fun numberOfMatches(n: Int): Int {
        var result = 0
        var team = n
        
        while(team != 1) {
            result += team / 2
            if(team % 2 == 0) team /= 2
            else team = team / 2 + 1
        }
        
        return result
    }
}