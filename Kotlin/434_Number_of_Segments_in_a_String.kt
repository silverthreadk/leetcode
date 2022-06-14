class Solution {
    fun countSegments(s: String): Int {
        var result = 0
        var isPriviousSpace = true
        
        for(ch in s){
            if(isPriviousSpace && ch != ' '){
                ++result
            }
            
            isPriviousSpace = ch == ' '
        }
        
        return result
    }
}