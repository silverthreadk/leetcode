class Solution {
    fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray {
        val result = DoubleArray(nums.size-k+1)
        val sorted = mutableListOf<Double>()
        
        for(i in 0..k-1) {
            sorted.add(nums[i].toDouble())
        }
        sorted.sort()
        
        val is_even = k%2 == 0
        result[0] = if(is_even) (sorted.get(k/2-1) + sorted.get(k/2))/2.0 else sorted.get(k/2).toDouble()
        
        for(i in 0..nums.size-k-1){
            var index = sorted.binarySearch(nums[i+k].toDouble())
            if(index>=0){
                sorted.add(index, nums[i+k].toDouble());
            }else{
				sorted.add(-index-1, nums[i+k].toDouble());
            }
            index=sorted.binarySearch(nums[i].toDouble());
            sorted.removeAt(index);
            result[i+1] = if(is_even) (sorted.get(k/2-1) + sorted.get(k/2))/2.0 else sorted.get(k/2).toDouble()
            
        }
        
        return result
    }
}