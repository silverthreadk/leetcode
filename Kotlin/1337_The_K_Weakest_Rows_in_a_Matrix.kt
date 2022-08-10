class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val result = IntArray(k)
        val pq = PriorityQueue<Pair<Int, Int>>() { a, b ->
            if(a.first == b.first) b.second - a.second
            else b.first - a.first
        }
        
        for(i in 0 until mat.size) {
            pq.offer(mat[i].sum() to i)
            if(pq.size > k) pq.poll()
        }
        
        for(i in 0 until k){
            result[k - 1 - i] = pq.poll().second
        }
        
        return result
    }
}