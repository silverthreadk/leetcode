class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var lo = 0
        var hi = num

        while(lo <= hi){
            val mid = lo + (hi - lo) / 2
            val square = mid.toLong() * mid.toLong()
            if(square == num.toLong()) return true
            else if(square < num.toLong()) lo = mid + 1
            else hi = mid - 1
        }

        return false
    }
}