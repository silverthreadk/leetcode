class Solution {
    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        var result = 0
        
        arr1.forEach { num1 ->
            val count = arr2.count{ num2 -> Math.abs(num1 - num2) > d}
            
            if(count == arr2.size) ++result
        }
        
        return result
    }
}