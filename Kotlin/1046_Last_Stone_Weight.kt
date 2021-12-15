class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        pq.addAll(stones.toList())
        
        var max1: Int
        var max2: Int
        while(pq.size > 1) {
            val y = pq.poll()
            val x = pq.poll()
            
            if(y - x > 0) pq.offer(y - x)
        }
        if (pq.isEmpty()) return 0
        
        return pq.poll()
    }
}