class Solution {
    fun reorderedPowerOf2(N: Int): Boolean {
        val s = N.toString().sort()
        
        for(i in 0..30){
            val power_of_2 = (1 shl i).toString()
            if(s.length != power_of_2.length) continue
            else if(s.length < power_of_2.length) return false
            
            if(s == power_of_2.sort()) return true
        }
        
        return false
    }
}

fun String.sort() = String(toCharArray().apply{ sort() })