class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var result = 0
        var h = x xor y
        
        for(i in 0..31){
            result += (h ushr i) and 1
        }
        
        return result
    }
}