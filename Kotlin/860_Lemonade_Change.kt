class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var change = IntArray(3) {0}
        
        bills.forEach{bill ->
            if(bill == 5) {
                ++change[0]
            } else if(bill == 10 && change[0] > 0) {
                ++change[1]
                --change[0]
            } else if(change[1] > 0 && change[0] > 0) {
                --change[1]
                --change[0]
            } else if(change[0] >= 3) {
                change[0] -= 3
            } else {
                return false
            }
        }
        
        return true
    }
}