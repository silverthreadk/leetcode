class Solution {
    fun thirdMax(nums: IntArray): Int {
        val pq = PriorityQueue<Int>()
        
        nums.forEach{num ->
            if(!pq.contains(num)) pq.add(num)
            if(pq.size>3) {
                pq.poll()
            }
        }
        
        if(pq.size < 3) return pq.max()!!
        else return pq.poll()
    }
}