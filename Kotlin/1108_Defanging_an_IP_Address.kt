class Solution {
    fun defangIPaddr(address: String): String {
        val result = StringBuilder()
        
        for(ch in address) {
            if(ch == '.') {
                result.append("[.]")
            } else {
                result.append(ch)
            }
        }
        
        return result.toString()
    }
}