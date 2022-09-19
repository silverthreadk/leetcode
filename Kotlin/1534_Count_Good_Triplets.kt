class Solution {
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
        var result = 0
        for(i in 0 until arr.size){
            for(j in i + 1 until arr.size){
                if(Math.abs(arr[i] - arr[j]) > a) continue
                
                for(k in j + 1 until arr.size){
                    if(Math.abs(arr[j] - arr[k]) > b) continue
                    if(Math.abs(arr[i] - arr[k]) > c) continue
                    ++result
                }
            }
        }
        
        return result
    }
}