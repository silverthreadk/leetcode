class Solution {
    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        var result = 0
        val m = mutableMapOf<String, Int>()


        for(word in words1) {
            m[word] = (m[word] ?: 0) + 1
        }

        for(word in words2) {
            m[word]?.let{
                if(it < 2) m[word] = it - 1
            }
        }
        
        return m.count {
            it.value == 0
        }
    }
}