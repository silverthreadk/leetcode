/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var lo = 1
        var hi = n
        
        while(lo < hi){
            val mid = lo + (hi - lo) / 2
            if(isBadVersion(mid)){
                hi = mid
            } else {
                lo = mid + 1
            }
        }
        
        return lo
	}
}