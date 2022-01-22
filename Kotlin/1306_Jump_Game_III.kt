class Solution {
    fun canReach(arr: IntArray, start: Int): Boolean {
        val visit: BooleanArray = BooleanArray(arr.size) {false}
        return recursive(arr, start, visit)
    }
    
    fun recursive(arr: IntArray, index: Int, visit: BooleanArray): Boolean {
        if(index < 0) return false
        if(index >= arr.size) return false
        if(visit[index]) return false
        if(arr[index] == 0) return true
        
        visit[index] = true
        
        return recursive(arr, index - arr[index], visit) or recursive(arr, index + arr[index], visit)
    }
}