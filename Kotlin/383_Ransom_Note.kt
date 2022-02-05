class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val m = IntArray(26)
        magazine.forEach{
            ++m[it - 'a']
        }
        
        ransomNote.forEach{
            if(m[it - 'a'] == 0) return false
            --m[it - 'a']
        }
        
        return true
    }
}