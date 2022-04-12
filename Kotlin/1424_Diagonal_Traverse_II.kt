class Solution {
    fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
        val result = mutableMapOf<Int, MutableList<Int>>()
        
        for(i in nums.indices) {
            for(j in nums[i].indices) {
               result.putIfAbsent(i + j, mutableListOf())
               result[i + j]?.add(0, nums[i][j])
           }
       }
       
       return result.map { it.value }.flatten().toIntArray()
    }
}