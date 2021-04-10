class Solution {
    fun flipgame(fronts: IntArray, backs: IntArray): Int {
        var minimum = 2001
        val s = mutableSetOf<Int>()
        for(i in 0 until fronts.size){
            if(fronts[i] == backs[i]) s.add(fronts[i])
        }
        for(i in 0 until fronts.size){
            if(!s.contains(fronts[i])) minimum = minOf(minimum, fronts[i])
            if(!s.contains(backs[i])) minimum = minOf(minimum, backs[i])
        }
        
        return if(minimum == 2001) 0 else minimum
    }
}