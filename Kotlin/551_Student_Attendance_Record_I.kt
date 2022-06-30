class Solution {
    fun checkRecord(s: String): Boolean {
        var absentCount = 0
        var lateCount = 0
        
        for(ch in s){
            if(ch == 'A') {
                ++absentCount
                if(absentCount > 1) return false
            } else if(ch == 'L'){
                ++lateCount
                if(lateCount > 2) return false
                continue
            }
            
            lateCount = 0
        }
        
        return true
    }
}