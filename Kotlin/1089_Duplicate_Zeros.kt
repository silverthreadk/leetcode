class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        var zeroCount = arr.count{it == 0}
        
        for(i in arr.size - 1 downTo 0){
            if(i + zeroCount <= arr.size - 1){
                arr[i + zeroCount] = arr[i]
                if(arr[i] == 0){
                    arr[i + zeroCount - 1] = 0
                    --zeroCount
                }
            } else {
                if(arr[i] == 0){
                    --zeroCount
                }
                if(i + zeroCount <= arr.size - 1){
                    arr[i + zeroCount] = arr[i]
                }
            }
        }
    }
}