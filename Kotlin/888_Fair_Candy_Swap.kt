class Solution {
    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
        val sumAlice = aliceSizes.sum()
        val sumBob = bobSizes.sum()
        val difference = (sumBob - sumAlice) / 2
        
        val setAlice = aliceSizes.toSet()
    
        bobSizes.forEach{
            if(setAlice.contains(it - difference)){
                return intArrayOf(it - difference, it)
            } 
        }
        
        return intArrayOf()
    }
}