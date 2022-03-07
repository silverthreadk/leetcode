class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>()
        
        nums.forEach{ num ->
            if(pq.size < k){
                pq.add(num)
            }else if(pq.peek() < num){
                pq.add(num)
                pq.poll()
            }
        }
        
        return pq.peek()
    }
}