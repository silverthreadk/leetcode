class Solution {
    fun sequentialDigits(low: Int, high: Int): List<Int> {
        val result = mutableListOf<Int>()
        
        for (i in 1 until 10) {
            var num = i
            var nextNum = num
            while(num <= high && nextNum < 10){
                if(num >= low) result.add(num)
                ++nextNum
                num = 10 * num + nextNum
            }
        }
        
        return result.sorted()
    }
}