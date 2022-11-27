class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val sortedMap = score.sortedDescending()
                             .mapIndexed{i, v-> Pair(v ,i)}.toMap()
        
        return score.map{
            when (val rank = sortedMap.get(it)!! + 1) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> rank.toString()
            }
        }.toTypedArray()
    }
}