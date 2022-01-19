class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var result = 0
        val sumCount = HashMap<Int, Int>()
        sumCount[0] = 1
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            if(sumCount.contains(sum - k)){
                result += sumCount.getOrDefault(sum - k, 0)
            }
            sumCount[sum] = sumCount.getOrDefault(sum, 0) + 1
        }

        return result
    }
}