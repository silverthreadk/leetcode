class Solution {
    fun validPalindrome(s: String): Boolean {
        val n = s.length
        for(i in 0 until n / 2) {
            if(s[i] == s[n - i - 1]) continue

            return isPalindrome(s, i + 1, n - i - 1) || isPalindrome(s, i, n - i - 2)
        }

        return true
    }
    
    fun isPalindrome(s: String, begin: Int, end: Int): Boolean {
        var i = begin; var j = end
        while(i < j) {
            if (s[i++] != s[j--]) return false
        }
        
        return true
    }
}