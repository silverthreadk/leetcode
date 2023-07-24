class Solution {
    fun maximumSwap(num: Int): Int {
        val s = num.toString().toCharArray()
        val index = HashMap<Char, Int>()
        
        for(i in s.indices) {
            index[s[i]] = i 
        }
        
        for(i in s.indices) {
            for(j in '9' downTo '0') {
                index[j]?.let{ index ->
                    if(s[i] < j && index > i) {
                        s[i] = s[index].also { s[index] = s[i] }
                        return String(s).toInt()   
                    }
                }
            }
        }
        
        return num
    }
}