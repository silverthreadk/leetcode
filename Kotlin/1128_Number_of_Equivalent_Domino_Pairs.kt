class Solution {
    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        var result = 0
        val visit = Array(10) { IntArray(10) }
        
        for(domino in dominoes) {
            val minValue = minOf(domino[0], domino[1])
            val maxValue = maxOf(domino[0], domino[1])
            
            result += visit[minValue][maxValue]++
        }
        
        return result
    }
}