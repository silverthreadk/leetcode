class Solution {
    fun numberOfBoomerangs(points: Array<IntArray>): Int {
        var result = 0
        for(i in points){
            val frequnecy = HashMap<Int,Int>()
            for(j in points){
                if (j.contentEquals(i)) continue
                
                val x = i[1] - j[1]
                val y = i[0] - j[0]
                val distance = x*x + y*y
                frequnecy.put(distance, frequnecy.getOrDefault(distance, 0) + 1)
            }

            for(it in frequnecy){
                result += it.value * (it.value - 1)
            }
        }
        
        return result
    }
}