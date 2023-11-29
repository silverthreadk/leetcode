class Solution {
    fun maxScore(s: String): Int {
        var result = 0
        var one = s.count{ it == '1' }
        var zero = 0

        for(i in 0 until s.length - 1) {
            if(s[i] == '0') ++zero
            if(s[i] == '1') --one

            result = maxOf(result, zero + one)
        }

        return result
    }
}