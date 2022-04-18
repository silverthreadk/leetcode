class Solution {
    fun buildArray(target: IntArray, n: Int): List<String> {
        val result = ArrayList<String>()
        var i = 1
        
        target.forEach{ num ->
            while(num != i) {
                result.add("Push")
                result.add("Pop")
                ++i
            }
            result.add("Push")
            ++i
        }
        
        return result
    }
}