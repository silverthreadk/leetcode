class Solution {
    fun countDigitOne(n: Int): Int {
        var result = 0
        var current = n
        var digit_number = 1
        while(current != 0) {
            val remainder = current % 10
            current /= 10
            
            result += current * digit_number
            if (remainder == 1) {
                result += (n % digit_number) + 1
            } else if (remainder > 1) {
                result += digit_number
            }
            
            digit_number *= 10
        }
        
        return result
    }
}