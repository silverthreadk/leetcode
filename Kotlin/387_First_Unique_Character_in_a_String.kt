class Solution {
    fun firstUniqChar(s: String): Int {
        val m = mutableMapOf<Char, Int>()
        for(ch in s){
            m.put(ch, m.getOrDefault(ch, 0) + 1)
        }
        
        for(i in s.indices) {
            if(m[s[i]] == 1) return i
        }
        
        return -1      
    }
}