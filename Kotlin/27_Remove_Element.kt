class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        nums.forEach{ num ->
            if(num != `val`){
                nums[i] = num
                ++i
            }
        }
        
        return i
    }
}