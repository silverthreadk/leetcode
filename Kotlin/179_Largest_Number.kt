class Solution {
    fun largestNumber(nums: IntArray): String {
        if(nums.isEmpty()) return ""
        
        val sb = StringBuilder()
        nums.map{num -> num.toString()}
            .sortedWith(Comparator{ a, b -> (b + a).compareTo(a + b) })
            .forEach({
                sb.append(it)
            })
            
        if(sb[0].equals('0')) return "0"
        
        return sb.toString()
    }
}