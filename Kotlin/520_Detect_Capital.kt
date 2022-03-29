class Solution {
    fun detectCapitalUse(word: String): Boolean {
        val count = word.filter { it.isUpperCase() }.count()
        
        return count == word.length || count == 0 || count == 1 && word[0].isUpperCase()
    }
}