class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val result = mutableListOf<Int>()
        val dq = LinkedList<Int>()
        
        for(i in 0 until k) {
            while(dq.isNotEmpty() && nums[i] > nums[dq.last()]){
                dq.pollLast()
            }
            
            dq.offerLast(i)
        }
        result.add(nums[dq.first()])
        
        for(i in k until nums.size){
            if(dq.first() == i - k){
                dq.pollFirst()
            }
            
            while(dq.isNotEmpty() && nums[i] > nums[dq.last()]){
                dq.pollLast()
            }
            
            dq.offerLast(i)
            result.add(nums[dq.first()])
        }
        
        return result.toIntArray()
    }
}