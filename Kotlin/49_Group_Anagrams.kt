class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy{
            it.toCharArray().sorted().joinToString("")
        }.map{
            it.value
        }    
    }
}