class Solution {
    fun maxTurbulenceSize(arr: IntArray): Int {
        if (arr.size < 2) return arr.size
        
        var result = 0
        var count = 0
        var direction = 0
        
        for(i in 1 until arr.size){
            if(arr[i-1] - arr[i] == 0){
                count = 0;
                direction = 0
            } else if(arr[i-1] - arr[i] > 0){
                count = if(direction < 0) count + 1 else 1
                direction = 1
            } else{
                count = if(direction > 0) count + 1 else 1
                direction = -1
            }
            result = maxOf(result, count)
        }
        
        return result + 1 
    }
}