class Solution {
    fun reformatNumber(number: String): String {
        val result = StringBuilder()
        var count = 0
        
        for(ch in number) {
            if(!ch.isDigit()) continue
            
            result.append(ch)
            ++count
            if(count % 3 == 0) result.append('-')
        }

        if(result[result.length - 1] == '-') {
            result.deleteCharAt(result.length - 1)
        } else if(result[result.length - 2] == '-') {
            val ch1 = result[result.length - 2]
            val ch2 = result[result.length - 3]
            result.setCharAt(result.length - 2, ch2)
            result.setCharAt(result.length - 3, ch1)
        }
        
        return result.toString()
    }
}