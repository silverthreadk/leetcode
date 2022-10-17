class Solution {
    fun maxSumDivThree(nums: IntArray): Int {
        var sum = 0
        var mod1 = 100000
        var mod2 = 100000
        for(num in nums) {
            sum += num
            
            when(num % 3) {
                1 -> {
                    mod2 = minOf(mod2, mod1 + num)
                    mod1 = minOf(mod1, num)
                }
                2 -> {
                    mod1 = minOf(mod1, mod2 + num)
                    mod2 = minOf(mod2, num)
                }
            }
        }
        
        when(sum % 3) {
            1 -> return sum - mod1
            2 -> return sum - mod2
        }
        
        return sum
    }
}