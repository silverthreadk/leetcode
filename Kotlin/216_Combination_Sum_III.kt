class Solution {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        recursive(k, n, 1, ArrayList<Int>(), result)
        return result
    }
    
    fun recursive(k: Int, n: Int, start: Int, combination: ArrayList<Int>, result: ArrayList<List<Int>>){
        if(k == 0 && n == 0){
            result.add(combination.toList())
        } else if(k <= 0 || n <= 0){
            return
        }
        for (i in start until 10){
            combination.add(i)
            recursive(k-1, n-i, i+1, combination, result)
            combination.removeAt(combination.size - 1)
        }
    }
}