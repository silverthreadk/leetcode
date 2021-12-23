class Solution {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val frequency = TreeMap<Int, Int>()
        
        arr1.forEach{
            frequency.put(it, frequency.getOrDefault(it, 0) + 1)
        }

        arr2.forEach{
            for(i in 0 until frequency[it]!!){
                result.add(it)
            }

            frequency[it] = 0
        }
        
        frequency.forEach{ (key, value) ->
            for(i in 0 until value){
                result.add(key)
            }
        }
        
        return result.toIntArray()
    }
}