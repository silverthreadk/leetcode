class Solution {
    fun findLucky(arr: IntArray): Int {
        val frequency = IntArray(501)
        
        arr.forEach{ num ->
            ++frequency[num]
        }
        
        for(i in frequency.lastIndex downTo (1)) {
            if(frequency[i] == i) return i
        }
        
        return -1
    }
}