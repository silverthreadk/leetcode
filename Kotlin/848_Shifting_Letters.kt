class Solution {
    fun shiftingLetters(s: String, shifts: IntArray): String {
        val result = StringBuilder()
        val n = shifts.size
        val shiftSum = LongArray(n)
        
        shiftSum[n - 1] = shifts[n - 1].toLong() % 26
        for(i in n - 2 downTo 0) {
            shiftSum[i] = (shiftSum[i + 1] + shifts[i]) % 26
        }
        
        for(i in shiftSum.indices) {
            result.append((((s[i] - 'a' + shiftSum[i]) % 26) + 'a'.toInt()).toChar())
        }
        
        return result.toString()
    }
}