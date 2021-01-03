class Solution {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        val result: MutableList<MutableList<Int>> = ArrayList()
        val n = Math.min(k, nums1.size*nums2.size)
        if(n == 0) return result
        
        val max_sum = nums1.last() + nums2.last()
        val index = IntArray(nums1.size)
        var next = 0;
        for(i in 1..n) {
            var min_sum = max_sum
            var u = 0

            for(j in 0..nums1.lastIndex) {
                if (index[j] < nums2.size && min_sum >= nums1[j] + nums2[index[j]]) {
                    min_sum = nums1[j] + nums2[index[j]]
                    u = j
                }
                if (index[j] == next) break
            }
            val pair = mutableListOf<Int>()
            pair.add(nums1[u])
            pair.add(nums2[index[u]])
            result.add(pair);

            ++index[u];
            if(u == nums1.size -1) ++next
        }
        
        return result
    }
}