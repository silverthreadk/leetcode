class Solution {
    fun maxScoreSightseeingPair(values: IntArray): Int {
        var result = 0;
        var prev = values[0];
        
        for(i in 1 until values.size){
            result = Math.max(result, prev + values[i] - i);
            prev = Math.max(prev, values[i] + i);
        }
        
        return result;
    }
}