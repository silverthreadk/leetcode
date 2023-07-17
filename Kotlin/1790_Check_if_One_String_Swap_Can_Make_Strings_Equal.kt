class Solution {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        val diff = s1.indices.filter { s1[it] != s2[it] }
        
        if(diff.isEmpty()) return true
        if(diff.size == 2) {
            val (index1, index2) = diff
            return s1[index1] == s2[index2] && s1[index2] == s2[index1]
        }
        
        return false
    }
}