class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val result = mutableSetOf<String>()
        
        for(i in words.indices) {
            for(j in words.indices) {
                if (i != j && words[i].contains(words[j])){
                    result.add(words[j])
                }
            }
        }
        
        return result.toList()
    }
}