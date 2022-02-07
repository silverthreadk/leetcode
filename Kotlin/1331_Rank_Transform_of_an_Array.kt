class Solution {
    fun arrayRankTransform(arr: IntArray): IntArray {
        var result = mutableListOf<Int>()
        val sorted = arr.sortedArray()
        val m = HashMap<Int, Int>()
        
        sorted.forEach{
            m.putIfAbsent(it, m.size + 1)
        }
        
        return arr.map{
            m.get(it)!!
        }.toIntArray()
    }
}