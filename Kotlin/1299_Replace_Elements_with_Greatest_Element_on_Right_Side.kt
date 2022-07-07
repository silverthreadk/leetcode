class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val result = IntArray(arr.size)
        var greatestElement = arr.last()
        result[arr.size - 1] = -1
        
        for(i in arr.size - 2 downTo 0){
            result[i] = greatestElement
            
            if(greatestElement < arr[i]){
                greatestElement = arr[i]
            }
        }
        
        return result
    }
}