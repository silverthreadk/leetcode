class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val m = mutableMapOf<Int, Int>()
        val s = mutableSetOf<Int>()
        
        arr.forEach{num ->
            m[num] = m.getOrDefault(num, 0) + 1
        }
        
        m.values.forEach{it ->
            if(s.contains(it)) return false
            s.add(it)
        }
        
        return true
    }
}