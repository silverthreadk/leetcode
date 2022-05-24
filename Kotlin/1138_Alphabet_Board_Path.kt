class Solution {
    fun alphabetBoardPath(target: String): String {
        val result = StringBuilder()
        var prevR = 0
        var prevC = 0
        
        target.forEach{ ch ->
            val r = (ch - 'a') / 5
            val c = (ch - 'a') % 5
            
            val diffR = r - prevR
            val diffC = c - prevC
            
            repeat(-diffR) {
                result.append('U')
            }
            repeat(-diffC) {
                result.append('L')
            }
            repeat(diffR) {
                result.append('D')
            }
            repeat(diffC) {
                result.append('R')
            }
            
            result.append('!')
            
            prevR = r
            prevC = c
        }
        
        return result.toString()
    }
}