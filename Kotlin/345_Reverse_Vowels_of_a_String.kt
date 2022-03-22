class Solution {
    fun reverseVowels(s: String): String {
        val result = s.toCharArray()
        var i = 0
        var j = s.lastIndex
        while(i<j){
            if(!isVowel(result[i])){
                ++i
            }
            
            if(!isVowel(result[j])){
                --j
            }
            
            if(isVowel(result[i]) && isVowel(result[j])){
                val temp = result[i]
                result[i++] = result[j]
                result[j--] = temp
            }
        }
        
        return String(result)
    }
    
    fun isVowel(ch : Char): Boolean {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
    }
}