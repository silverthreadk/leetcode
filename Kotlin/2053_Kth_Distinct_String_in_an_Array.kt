class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val frequency = mutableMapOf<String,Int>()

        for(s in arr){
            frequency[s] = frequency.getOrDefault(s, 0) + 1
        }

        var index = 0
        for(s in arr){
            if(frequency[s] == 1) ++index

            if(index == k) return s
        }

        return ""
    }
}