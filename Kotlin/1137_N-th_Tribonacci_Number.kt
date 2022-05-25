class Solution {
    fun tribonacci(n: Int): Int {
        if (n == 0) return 0
        if (n < 3) return 1
        
        val t = IntArray(4)
        t[0] = 0
        t[1] = 1
        t[2] = 1

        for(i in 3..n) {
            t[3] = t[2] + t[1] + t[0]
            t[0] = t[1]
            t[1] = t[2]
            t[2] = t[3]
        }

        return t[3]
    }
}