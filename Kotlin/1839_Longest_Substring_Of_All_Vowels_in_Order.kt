class Solution {
    fun longestBeautifulSubstring(word: String): Int {
        var result = 0
        val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
        var length = 0
        var j = 0
        for (i in 0 until word.length) {
            if(word[i] == vowels[j]) {
                ++length;
            } else if(j < vowels.size - 1 && i > 0 && word[i - 1] == vowels[j] && word[i] == vowels[j + 1]) {
                ++length
                ++j
            } else if(word[i] == 'a') {
                length = 1
                j = 0
            } else {
                length = 0
                j = 0
            }
            
            if(word[i] == 'u' && vowels[j] == 'u') {
                result = maxOf(result, length)
            }
        }
        
        return result
    }
}