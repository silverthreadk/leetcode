class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false
        
        var reverted = 0
        var n = x
        while(n != 0){
            reverted = reverted * 10 + (n % 10)
            n /= 10
        }
        
        return reverted == x
    }
}