class Solution {
    fun minCostToMoveChips(position: IntArray): Int {
        val even = position.count{it % 2 == 0}
        
        return minOf(even, position.size - even)
    }
}