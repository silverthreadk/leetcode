class Solution {
    fun customSortString(S: String, T: String): String {
        val freq = IntArray(26)
        val result = StringBuilder()

        for(ch in T){
            ++freq[ch - 'a']
        }

        for(ch in S){
            if(freq[ch - 'a'] > 0){
                for(i in 0 until freq[ch - 'a']){
                    result.append(ch)
                }
                freq[ch - 'a'] = 0     
            }
        }

        for(i in 0 until freq.size){
            for(j in 0 until freq[i]){
                result.append('a' + i)
            }
        }
        
        return result.toString()
    }
}