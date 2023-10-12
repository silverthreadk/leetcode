class Solution {
    fun numberOfSteps(num: Int): Int {
        var result = 0
        var current = num

        while(current != 0){
            if(current and 1 == 1) --current
            else current = current shr 1
            ++result
        }

        return result
    }
}