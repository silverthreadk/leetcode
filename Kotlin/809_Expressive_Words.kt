class Solution {
    fun expressiveWords(S: String, words: Array<String>): Int {
        var result = 0
        val SLength = S.length
        for(word in words){
            val wordLength = word.length
            if(SLength < wordLength) continue
            var i = 0
            var j = 0
            while(i<SLength){
                if(j<wordLength && S[i] == word[j]) {
                    ++j
                    ++i
                }
                else if(i>0 && S[i]==S[i-1] && i+1<SLength && S[i]==S[i+1]) i+=2
                else if(i>1 && S[i]==S[i-1] && S[i]==S[i-2]) ++i
                else break
            }
            
            if(i==SLength && j == wordLength) ++result
        }
        
        return result
    }
}