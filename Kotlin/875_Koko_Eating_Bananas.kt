class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var lo = 1
        var hi = piles.max()!!
        
        while(lo < hi) {
            val mid  = (lo + hi) / 2
            if(check(piles, h, mid)) {
                hi = mid
            } else {
                lo = mid + 1
            }
        }
        
        return lo
    }
    
    fun check(piles:IntArray, h: Int, k:Int) : Boolean {
        var time = 0
        for(i in piles) {
            time += Math.ceil(i.toDouble() / k).toInt()
        }
        
        return time <= h
    }
}