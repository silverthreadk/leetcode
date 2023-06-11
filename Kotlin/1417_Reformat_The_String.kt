class Solution {
    fun reformat(s: String): String {
        val result = StringBuilder()
        val num = StringBuilder()
        val alpha = StringBuilder()
        
        for(ch in s) {
            if(ch.isDigit()) num.append(ch)
            if(ch.isLetter()) alpha.append(ch)
        }
        if(num.length > alpha.length + 1 || alpha.length > num.length + 1) return ""
        
        var first: StringBuilder
        var second: StringBuilder
        if(num.length > alpha.length) {
            first = num
            second = alpha
        } else {
            first = alpha
            second = num
        }
        
        for(i in 0 until second.length){
            result.append(first[i])
            result.append(second[i])
        }
        if(first.length > second.length) result.append(first.last())
        
        return result.toString()
    }
}