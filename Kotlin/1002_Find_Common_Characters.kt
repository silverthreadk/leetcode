class Solution {
    fun commonChars(words: Array<String>): List<String> {
        val result = ArrayList<String>()
        val commonFrequency = IntArray(26) { Int.MAX_VALUE }
        val frequency = IntArray(26) { 0 }
        
        for(i in words.indices) {
            for(j in words[i].indices) {
                ++frequency[words[i][j] - 'a']
            }
            for(j in commonFrequency.indices) {
                commonFrequency[j] = minOf(commonFrequency[j], frequency[j])
                frequency[j] = 0
            }
        }
        
        for(i in commonFrequency.indices) {
            for(j in 0 until commonFrequency[i]) {
                result.add((i + 'a'.toInt()).toChar().toString())
            }
        }
        
        return result
    }
}