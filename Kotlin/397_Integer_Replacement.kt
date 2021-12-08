class Solution {
    fun integerReplacement(n: Int): Int {
        if(n == 1) return 0
        else if(n % 2 == 0) return integerReplacement(n / 2) + 1
        else if(n == Int.MAX_VALUE) return integerReplacement(n - 1)
        else return minOf(integerReplacement(n + 1), integerReplacement(n - 1)) + 1
    }
}