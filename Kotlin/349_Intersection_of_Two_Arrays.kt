class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        var result = mutableListOf<Int>()
        var s1 = nums1.toMutableSet()
        var s2 = nums2.toMutableSet()
        
        s1.forEach {
            if(s2.contains(it)){
                result.add(it)
            }
        }
        
        return result.toIntArray()
    }
}