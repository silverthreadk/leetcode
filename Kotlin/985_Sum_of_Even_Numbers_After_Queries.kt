class Solution {
    fun sumEvenAfterQueries(nums: IntArray, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)
        var sum = 0
        nums.filter{num -> num and 1 == 0}
            .forEach{num ->
            sum += num
        }
        
        for(i in queries.indices){
            val index = queries[i][1]
            val num = nums[index] + queries[i][0]
            if(num and 1 == 0){
                sum += num
            }
            if(nums[index] and 1 == 0){
                sum -= nums[index]
            }
            nums[index] += queries[i][0]
            result[i] += sum
        }
        
        return result
    }
}