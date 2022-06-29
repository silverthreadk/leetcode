class Solution {
    fun thousandSeparator(n: Int): String {
        if(n < 1000) return n.toString()
        
        val result = StringBuilder()
        var current = n
        var count = 0
        
        while(current > 0) {
            val remain = current % 10
            result.append(remain)
            current /= 10
            ++count
            if(count % 3 == 0 && current > 0) {
                result.append('.')
            }
        }
        
        return result.reverse().toString()
	}
}