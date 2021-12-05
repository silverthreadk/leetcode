class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result = ArrayList<Int>()
        val m = HashMap<Int, Int>()

        for(num in nums1) {
            m[num] = m.getOrDefault(num, 0) + 1
        }

        for(num in nums2) {
            if(m.contains(num) && m[num]!! > 0) {
                result.add(num)
                m[num] = m[num]!! - 1
            }
        }

        return result.toIntArray()
    }
}