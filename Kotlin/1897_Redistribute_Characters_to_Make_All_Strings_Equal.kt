class Solution {
    fun makeEqual(words: Array<String>): Boolean {
        val frequency = IntArray(26)

        words.forEach { word ->
            word.forEach { ch ->
                ++frequency[ch - 'a']
            }
        }
                        
        for(it in frequency) {
            if(it % words.size != 0) return false
        }
        
        return true
    }
}