class Solution {
    fun maxSatisfaction(satisfaction: IntArray): Int {
        var result = 0
        var sum = 0
        var current = 0
        
        satisfaction.sort()

        for(i in satisfaction.size - 1 downTo 0) {
            sum += satisfaction[i]
            current += sum
            result = maxOf(result, current)
        }

        return result
    }
}