class Solution {
    fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
        var result = 0
        var minValue = Integer.MAX_VALUE
        val pq = PriorityQueue<Int>()
        
        nums.forEach { num ->
            result += num
            minValue = minOf(minValue, Math.abs(num))
            pq.offer(num)
        }
        
        if(pq.peek() >= 0) return result - (k and 1) * 2 * minValue

        for(i in 0 until k) {
            if(pq.isEmpty() || pq.peek() > 0) return result - ((k - i) and 1) * 2 * minValue
            result += -2 * pq.poll()
        }
        
        return result
    }
}