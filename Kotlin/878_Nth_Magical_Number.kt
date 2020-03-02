class Solution {
    fun nthMagicalNumber(N: Int, A: Int, B: Int): Int {
        fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)
        fun lcm(a: Long, b: Long): Long = a / gcd(a, b) * b
        
        var lcm_value = lcm(A.toLong(), B.toLong())
        var magical_number_count = lcm_value / A + lcm_value / B - 1
        var lo = N / magical_number_count * lcm_value
        var hi = lo + lcm_value
        var mi = 0L
        
        while(true) {
            mi = (lo + hi) / 2
            magical_number_count = mi / A + mi / B - mi / lcm_value
            
            if(magical_number_count > N) hi = mi
            else if(magical_number_count < N) lo = mi + 1
            else break
        }
        
        return ((mi - Math.min(mi % A.toLong(), mi % B.toLong())) % (Math.pow(10.0, 9.0).toLong() + 7)).toInt()
    }
}