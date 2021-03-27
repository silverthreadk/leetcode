class Solution {
    fun findDuplicate(paths: Array<String>): List<List<String>> {
        var result = ArrayList<List<String>>()
        val m = HashMap<String, HashSet<String>>()
        
        for(path in paths){
            val list = path.split(' ')
            val dir = list[0]
            for(i in 1 until list.size){
                val pos = list[i].indexOf('(')
                val next_pos = list[i].indexOf(')')
                val file = list[i].substring(0, pos)
                val content = list[i].substring(pos + 1, next_pos)
                val s = m.getOrDefault(content, hashSetOf())
                s.add(dir + "/" + file)
                m.put(content, s)
            }
        }
        
        m.forEach{
            if (it.value.size > 1) result.add(it.value.toList())
        }
        return result
    }
}