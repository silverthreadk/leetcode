class Solution {
    fun computeArea(ax1: Int, ay1: Int, ax2: Int, ay2: Int, bx1: Int, by1: Int, bx2: Int, by2: Int): Int {
        val area1 = (ax2 - ax1) * (ay2 - ay1)
        val area2 = (bx2 - bx1) * (by2 - by1)
        val xOverlap = maxOf(ax1, bx1) < minOf(ax2, bx2)
        val yOverlap = maxOf(ay1, by1) < minOf(ay2, by2)
        if(xOverlap && yOverlap){
            val area3 = (maxOf(ax1, bx1) - minOf(ax2, bx2)) * (maxOf(ay1, by1) - minOf(ay2, by2))
            return -area3 + area1 + area2
        }
        
        return area1 + area2
    }
}