class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var odd_count = 0
        arr.forEach{ it ->
            if(it and 1 == 1) ++odd_count
            else odd_count = 0
            
            if(odd_count == 3) return true
        }
        
        return false
    }
}