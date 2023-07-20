class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var product = 1
        var sum = 0
        var current = n
        var remainder = 0

        while (current > 0) {
            remainder = current % 10
            product *= current % 10
            sum += current % 10
            current /= 10
        }
        
        return product - sum
    }
}