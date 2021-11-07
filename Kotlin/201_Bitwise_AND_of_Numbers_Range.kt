class Solution {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var begin = left
        var end = right
        var i = 0
        
        while(begin != end) {
            begin = begin shr 1
            end = end shr 1
            ++i
        }
        
        return begin shl i
    }
}