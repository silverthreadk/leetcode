class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var result = 0
        val frequency = IntArray(26)
        
        for(ch in chars){
            ++frequency[ch - 'a']
        }
        
        for (word in words) {
            val temp = IntArray(26)
            var notFound = true
            for(ch in word){
                ++temp[ch - 'a']
                
                if(temp[ch - 'a'] > frequency[ch - 'a']) {
                    notFound = false
                    break
                }
            }
            
            if(notFound){
                result += word.length
            }
        }
        
        return result
    }
}