class Solution {
    fun addBinary(a: String, b: String): String {
        var sb = StringBuilder()
        var carry = 0
        var i = a.lastIndex
        var j = b.lastIndex
        
        while(i >= 0 || j >=0 || carry > 0) {
            
            if(i >= 0) carry += a[i--] - '0'
            if(j >= 0) carry += b[j--] - '0'                        
            
            sb.append(carry % 2)
            carry /= 2
        }
        
        return sb.reversed().toString()
    }
}