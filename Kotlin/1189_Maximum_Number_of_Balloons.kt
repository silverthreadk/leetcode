class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        val frequency = IntArray(5)
        
        for(i in text.indices) {
            val char = text[i]
            
            when(char) {
                'b' -> ++frequency[0]
                'a' -> ++frequency[1]
                'l' -> ++frequency[2]
                'o' -> ++frequency[3]
                'n' -> ++frequency[4]
            }
        }
        
        frequency[2] /= 2
        frequency[3] /= 2
        
        return frequency.min()!!
    }
}