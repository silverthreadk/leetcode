class Solution {
    fun countBalls(lowLimit: Int, highLimit: Int): Int {
        return (lowLimit .. highLimit).map{
            it.toString().sumBy { ch ->
                ch.toInt() - 48
            }
        }.groupingBy{ it }.eachCount().values.max()
    }
}