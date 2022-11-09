class Solution {
    fun validSquare(p1: IntArray, p2: IntArray, p3: IntArray, p4: IntArray): Boolean {
        val list = mutableListOf<Int>()
        
        list.add(getDistance(p1, p2))
        list.add(getDistance(p1, p3))
        list.add(getDistance(p1, p4))
        list.add(getDistance(p2, p3))
        list.add(getDistance(p2, p4))
        list.add(getDistance(p3, p4))
        
        val m = list.groupingBy { it }.eachCount()
        
        if(m.size != 2) return false
        if(m.contains(0)) return false
        
        return m.filter{it.value == 4}.isNotEmpty()
    }
    
    fun getDistance(a: IntArray, b: IntArray): Int {
        val x = a[0] - b[0]
        val y = a[1] - b[1]
        return x * x + y * y
    }
}