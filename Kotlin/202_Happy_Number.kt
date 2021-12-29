class Solution {
    fun isHappy(n: Int): Boolean {
        var sum = n
        while(sum/10 != 0){
            var i = sum
            sum = 0
            while(i != 0){
                val remainder = i % 10
                sum += remainder * remainder
                i /= 10
            }
        }
        
        return sum == 1 || sum == 7
    }
}