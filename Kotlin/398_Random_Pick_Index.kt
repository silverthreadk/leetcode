class Solution(nums: IntArray) {
    private val index = nums.withIndex().groupBy ({ it.value }, { it.index })
    
    fun pick(target: Int): Int {
        return index[target]?.random() ?: -1
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(nums)
 * var param_1 = obj.pick(target)
 */