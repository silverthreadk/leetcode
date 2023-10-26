class Solution {
    fun numDifferentIntegers(word: String): Int {
        val s = HashSet<String>()
        var num = ""
        
        for(i in word.indices) {
            if(word[i] == '0' && num.isEmpty() && i < word.length - 1 && word[i + 1].isDigit()) continue

            if(word[i].isDigit()) {
                num += word[i]
            } else if(i > 0 && word[i - 1].isDigit()) {
                s.add(num)
                num = ""
            }
        }
        
        if(word.last().isDigit()) s.add(num)

        return s.size
    }
}