class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        val result = mutableListOf<Int>()
        if(s.length < p.length)	return result
        
        val pFrequency = IntArray(26){0}
		val sFrequency = IntArray(26){0}

		for (i in p.indices) {
            ++sFrequency[s[i] - 'a']
			++pFrequency[p[i] - 'a']
		}
        
		if(pFrequency contentEquals sFrequency) result.add(0)
        
		for(i in p.length until s.length){
            ++sFrequency[s[i] - 'a']
            --sFrequency[s[i-p.length] - 'a']
            
			if(sFrequency contentEquals pFrequency) result.add(i - p.length + 1)
		}
        
		return result
    }
}