class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        var result = 0
        val frequency = HashMap<Int, Int>()
        
        for(num in nums) {
            if(frequency.contains(num)) {
                result -= frequency.getOrDefault(num, 0) * num
                frequency[num] = 0
                continue
            }
            result += num
            frequency.put(num, frequency.getOrDefault(num, 0) + 1)
        }

        return result
    }
}