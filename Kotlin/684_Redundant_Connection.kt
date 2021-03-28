class Solution {
    fun findRedundantConnection(edges: Array<IntArray>): IntArray {
        val parents = IntArray(1001)
        for(i in 0 until parents.size){
            parents[i] = i
        }
        
        for(edge in edges){
            val v1 = find(parents, edge[0])
            val v2 = find(parents, edge[1])
            if(v1 == v2) return edge
            parents[v1] = v2
        }
        
        return IntArray(0)
    }
    
    fun find(parents: IntArray, x: Int): Int {
        if(parents[x] != x) {
            parents[x] = find(parents, parents[x])
        }
        
        return parents[x]
    }
}