class KthLargest(val k: Int, nums: IntArray) {
    val pq  = PriorityQueue<Int>()
    
    init{
        nums.forEach{ num ->
            pq.offer(num)
        }
        
        while(pq.size > k){
            pq.poll()
        }
    }

    fun add(`val`: Int): Int {
        pq.offer(`val`)
        if(pq.size > k) {
            pq.poll()
        }
        
        return pq.peek()
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */