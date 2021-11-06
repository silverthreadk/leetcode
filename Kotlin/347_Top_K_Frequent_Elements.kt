class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val result = IntArray(k)
		val m = mutableMapOf<Int, Int>()
		for(num in nums) {
			m.put(num, m.getOrDefault(num, 0) + 1)
		}

        val maxHeap = PriorityQueue<Pair<Int, Int>>(Comparator { a, b ->
            b.second.compareTo(a.second) })
    
		for((key, value) in m) {
			maxHeap.offer(Pair(key, value))
		}

		for(i in 0 until k) {
            result[i] = maxHeap.poll().first
		}
        
		return result
    }
}