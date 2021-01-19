class Solution {
    fun uncommonFromSentences(A: String, B: String): Array<String> {
        val result = ArrayList<String>()
        val m = mutableMapOf<String, Int>()
        
        
        A.split(" ").forEach{
            m.put(it, m.getOrDefault(it, 0) + 1)
        }
        
        B.split(" ").forEach{
            m.put(it, m.getOrDefault(it, 0) + 1)
        }
        
        m.forEach{
            if(it.value == 1) result.add(it.key)
        }
        
        return result.toTypedArray() 
    }
}