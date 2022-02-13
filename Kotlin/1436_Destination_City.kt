class Solution {
    fun destCity(paths: List<List<String>>): String {
        val s = mutableSetOf<String>()
        
        paths.forEach{path ->
            s.add(path[1])
        }
        paths.forEach{path ->
            s.remove(path[0])
        }
        
        return s.first()
    }
}