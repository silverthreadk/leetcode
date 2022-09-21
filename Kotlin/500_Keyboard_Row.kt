class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val result = arrayListOf<String>()
        val row1 = sortedSetOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')
        val row2 = sortedSetOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')
        val row3 = sortedSetOf('z', 'x', 'c', 'v', 'b', 'n', 'm')
        
        for(word in words){
            if(hasRow(row1, word)){
                result.add(word)
            } else if(hasRow(row2, word)){
                result.add(word)
            } else if(hasRow(row3, word)){
                result.add(word)
            }
        }
        
        return result.toTypedArray()
    }
    
    fun hasRow(row: SortedSet<Char>, word: String) : Boolean {
        for(ch in word){
            if(!row.contains(ch.toLowerCase())) return false
        }
        
        return true
    }
}