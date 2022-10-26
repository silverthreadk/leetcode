class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val s = mutableSetOf<Int>()
        for(i in arr){
            if((i % 2 == 0 && s.contains(i / 2)) || s.contains(i * 2)) return true
            s.add(i)
        }
        
        return false
    }
}