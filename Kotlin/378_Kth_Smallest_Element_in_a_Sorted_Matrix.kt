class Solution {
    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        
        matrix.forEach { row ->
            row.forEach { col -> 
                pq.offer(col)
                if (pq.size > k) pq.remove()
            }
        }
        
        return pq.peek()
    }
}