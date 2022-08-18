class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val frequency = mutableMapOf<Int, Int>()
        
        for(num in nums) {
            frequency[num] = frequency.getOrDefault(num, 0) + 1
        }
        
        return nums.sortedWith(Comparator { a, b ->
            val aFrequency = frequency.getOrDefault(a, 0)
            val bFrequency = frequency.getOrDefault(b, 0)
            if (aFrequency == bFrequency) b.compareTo(a)
            else aFrequency.compareTo(bFrequency)
        }).toIntArray()
    }
}