class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        recursive(result, nums, 0)
        
        return result
    }
    
    fun recursive(result: MutableList<List<Int>>, nums: IntArray, index: Int): Unit {
        if(index == nums.size){
            result.add(nums.toList())
        }
        
        for(i in index until nums.size){
            swap(nums, i, index)
            recursive(result, nums, index + 1)
            swap(nums, i, index)            
        }
    }
    
    fun swap(nums: IntArray, i: Int, j: Int): Unit {
        val tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp
    }
}