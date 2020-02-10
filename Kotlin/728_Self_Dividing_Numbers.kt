class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        return (left..right).filter {
            var num = it
            while (num != 0) {
                val remainder = num % 10
                if (remainder == 0 || it % remainder != 0) {
                    break
                }
                num = num / 10
            }
            num == 0
        }
    }
}