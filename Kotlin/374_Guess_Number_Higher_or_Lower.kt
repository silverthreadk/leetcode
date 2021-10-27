/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var lo = 1
        var hi = n
        
        while (lo <= hi) {
            val mid = (hi - lo) / 2 + lo
            val result = guess(mid)
            
            when(result) {
                0 -> return mid
                1 -> lo = mid + 1
                -1 -> hi = mid - 1
            }
        }
        
        return lo
    }
}