class Solution {
    fun constructRectangle(area: Int): IntArray {
        val squareRoot = Math.sqrt(area.toDouble()).toInt()
        for(i in squareRoot downTo 1){
            if(area % i == 0) {
                return intArrayOf(area/i, i)
            }
        }
        
        return intArrayOf()
    }
}