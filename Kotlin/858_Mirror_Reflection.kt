class Solution {
    fun mirrorReflection(p: Int, q: Int): Int {
        if (q == 0) return 0
        val g = gcd(p, q)
        val x = (p / g) % 2
        val y = (q / g) % 2
        
        if(x == 1 && y == 1) return 1
        else if(x == 1) return 0
        else return 2
    }

    fun gcd(p: Int, q: Int): Int {
        if(p == 0) return q
        if(p > q) return gcd(q, p)
        return gcd(p, q % p)
    }
}