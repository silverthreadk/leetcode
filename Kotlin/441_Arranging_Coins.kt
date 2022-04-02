class Solution {
    fun arrangeCoins(n: Int): Int {
        var count = n
        var i = 0
        
        while(i < count){
            ++i
            count -= i
        }
        
        return i
    }
}