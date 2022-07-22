class Solution {
    fun decodeAtIndex(s: String, k: Int): String {
        var i = 0L
        
        s.forEach{ch ->
            if(ch >= '0' && ch <= '9') {
                if(i * (ch - '0') >= k) return decodeAtIndex(s, ((k - 1) % i).toInt() + 1)
                i *= ch - '0'
            } else if (++i == k.toLong()){
                return ch.toString()
            }
        }
            
        return ""
    }
}