class Solution {
    fun rotateString(A: String, B: String): Boolean {
        if(A=="" && B=="") return true
        if(A.length!=B.length) return false
        
        return (A + A).contains(B)
    }
}