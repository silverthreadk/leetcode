class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
       	if(arr.size < 3) return false
        
        var increasing = true
        for(i in 1 until arr.size){
            if(arr[i] > arr[i-1]){
                if(!increasing) return false
            }else if(arr[i] < arr[i-1]){
                if(i == 1) return false
                increasing = false
            }else{
                return false
            }
        }
        
        return !increasing
    }
}