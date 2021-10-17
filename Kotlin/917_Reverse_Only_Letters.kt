class Solution {
    fun reverseOnlyLetters(s: String): String {
        val result = s.toCharArray()
        var i = 0
        var j = s.length - 1
        
        while (i < j) {
            if(!result[i].isLetter()) {
                ++i
                continue
            }
            else if (!result[j].isLetter()){
                --j
                continue
            }
            swap(result, i, j);
            ++i
            --j
        }
    
        return String(result);
    }
    
    private fun swap(c: CharArray, i: Int, j: Int) {
        val temp = c[i]
        c[i] = c[j]
        c[j] = temp
    }
}