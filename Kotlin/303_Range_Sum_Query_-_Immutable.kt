class NumArray(nums: IntArray) {
    private val sum = IntArray(nums.size + 1) { 0 }

    init {
        for(i in nums.indices) {
            sum[i + 1] = sum[i] + nums[i]
        }
    }
    
    fun sumRange(left: Int, right: Int): Int {
        return sum[right + 1] - sum[left]
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */