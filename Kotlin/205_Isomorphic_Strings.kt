class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val m1 = HashMap<Char, Int>()
        val m2 = HashMap<Char, Int>()

        for (i in 0 until s.length) {
            if(m1[s[i]] != m2[t[i]]) return false
            
            m1[s[i]] = i + 1
            m2[t[i]] = i + 1
        }
        
        return true
    }
}