class Solution {
    fun numOfBurgers(tomatoSlices: Int, cheeseSlices: Int): List<Int> {
        val x = (tomatoSlices - 2 * cheeseSlices) / 2
        val y = (-tomatoSlices + 4 * cheeseSlices) / 2
        
        if(x >= 0 && y >= 0 && (4 * x + 2 * y) == tomatoSlices && (x + y == cheeseSlices)){
            return mutableListOf(x, y)
        }
        
        return mutableListOf()
    }
}