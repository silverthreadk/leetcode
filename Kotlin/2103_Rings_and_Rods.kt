class Solution {
    fun countPoints(rings: String): Int {
        val m = HashMap<Char, HashSet<Char>>()

        for (i in 0 until rings.length step 2) {
            val s = m.getOrDefault(rings[i + 1], hashSetOf())
            s.add(rings[i])
            m.put(rings[i + 1], s)
        }

        return m.values.count { it.size == 3}
    }
}