class Solution {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        val result = mutableListOf<String>()

        words.forEach{ word ->
            if(match(word, pattern)) {
                result.add(word)
            }
        }
        
        return result
    }
    
    private fun match(word: String, pattern: String): Boolean {
        val m = HashMap<Char, Char>()
        val s = HashSet<Char>()
        
        for(i in 0 until word.length) {
            if(!m.contains(word[i])){
                m[word[i]] = pattern[i]
                if(s.contains(pattern[i])) return false
                s.add(pattern[i])
            } else if(m[word[i]] != pattern[i]){
                return false
            }
        }
        
        return true
    }
}