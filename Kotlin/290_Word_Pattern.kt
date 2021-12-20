class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if(pattern.length != words.size) return false
        
        val patternMap = hashMapOf<Char, String>()
        val wordMap = hashMapOf<String, Char>()
        
        for(i in pattern.indices) {
            val p = pattern[i]
            val word = words[i]
            if(patternMap.containsKey(p)) {
                if(!patternMap[p].equals(word) && wordMap[word] != p) return false
            }
            patternMap.putIfAbsent(p, word)
            wordMap.putIfAbsent(word, p)
            
            if(patternMap.size != wordMap.size) return false
        }
        
        return true
    }
}