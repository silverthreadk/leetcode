class Solution {
    fun isPathCrossing(path: String): Boolean {
        var x = 0
        var y = 0
        val visit = mutableSetOf("$x,$y")
        
        for(direction in path){
            when (direction) {
                'N' -> --y
                'S' -> ++y
                'E' -> ++x
                'W' -> --x
            }
            if (visit.contains("$x,$y")) return true
            visit.add("$x,$y")
        }
        
        return false
    }
}