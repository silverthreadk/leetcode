class Solution {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        val frequency = IntArray(26)
        var maxFrequency = 0
        
        for(task in tasks) {
            maxFrequency = maxOf(maxFrequency, ++frequency[task - 'A'])
        }

        val remain = frequency.count { it == maxFrequency }

        return maxOf(tasks.size, (n + 1) * (maxFrequency - 1) + remain)
    }
}