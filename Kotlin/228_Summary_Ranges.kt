class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if(nums.isEmpty()) return emptyList()
        
		val result = arrayListOf<String>()
        var begin = nums[0]
		var end = nums[0]
		val builder = StringBuilder()

        for(i in 1 until nums.size) {
            if(nums[i] == nums[i-1] + 1) {
                end = nums[i]
            } else {
                result.add(getRange(begin, end))
                
                begin = nums[i]
                end = begin
            }
            
        }
        result.add(getRange(begin, end))
        
		return result
    }

    fun getRange(begin: Int, end: Int): String{
        return if (begin == end) "$begin" else "$begin->$end"
    }
}