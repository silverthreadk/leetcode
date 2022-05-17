class Solution {
    fun frequencySort(s: String): String {
        val result = StringBuilder()
        val m = hashMapOf<Char, Int>()
        for(i in s.indices) {
            m[s[i]] = m.getOrDefault(s[i], 0) + 1
        }

        val pq = PriorityQueue<Pair<Int, Char>>( compareByDescending{it.first} )
        m.forEach { (char, count) ->
            pq.add(Pair(count, char))
        }
        
        while(pq.isNotEmpty()) {
            val current = pq.remove()
            for(i in 0 until current.first){
                result.append(current.second)
            }
        }
        
        return result.toString()
    }
}