class Solution {
    fun rotatedDigits(N: Int): Int {
        var result = 0
        for(i in 0..N){
            if(isGoodNumber(i)) ++result
        }
        
        return result
    }
    
    fun isGoodNumber(num : Int) : Boolean{
        var curr = num
        var result = false
        while(curr != 0){
            var remainder = curr % 10
            if(remainder == 3 || remainder == 4 || remainder == 7){
                return false
            }
            if(remainder == 2 || remainder == 5 || remainder == 6 || remainder == 9) result = true
            curr = curr/10
        }
        
        return result
    }
}