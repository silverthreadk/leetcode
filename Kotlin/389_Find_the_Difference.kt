class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var result = 0
        
        s.forEach{ ch ->
            result = result xor ch.toInt()
        }
        
        t.forEach{ ch ->
            result = result xor ch.toInt()
        }
        
        return result.toChar()
    }
}