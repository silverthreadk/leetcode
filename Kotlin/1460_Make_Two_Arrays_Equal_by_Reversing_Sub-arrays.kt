class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        var frequency = IntArray(1001)
        
        for(i in target.indices) {
            ++frequency[target[i]]
            --frequency[arr[i]]
        }
        
        frequency.forEach{
            if(it != 0) return false
        }
        
        return true
    }
}