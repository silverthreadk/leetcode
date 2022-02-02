class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        
        val frequency1 = IntArray(26)
        val frequency2 = IntArray(26)
        
        for(i in s1.indices) {
            ++frequency1[s1[i] - 'a']
            ++frequency2[s2[i] - 'a']
        }
        
        var count = 0
        for(i in 0 until 26) {
            if (frequency1[i] == frequency2[i]) ++count
        }
        
        for(i in s1.length until s2.length) {
            if(count == 26) return true
            
            val left = s2[i] - 'a'
            val right = s2[i - s1.length]-'a'
            
            if(frequency1[left] == frequency2[left]){
                --count
            }
            if(frequency1[right] == frequency2[right]){
                --count
            }
            
            ++frequency2[left]
            --frequency2[right]
            
            if(frequency1[left] == frequency2[left]){
                ++count
            }
            if(frequency1[right] == frequency2[right]){
                ++count
            }
        }
        
        return count == 26
    }
}