class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var lo = 0
        var hi = letters.size

        while(lo < hi) {
            val mid = lo + (hi - lo) / 2
            if(letters[mid] <= target) lo = mid + 1
            else hi = mid
        }
        
        return letters[lo % letters.size]
    }
}