class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        val m = image.size
        val n = image[0].size
        val result = Array(m) { IntArray(n) }
        
        for(i in image.indices) {
            for(j in image[i].size - 1 downTo 0) {
                result[i][image[i].size - 1 - j] = image[i][j] xor 1
            }
        }
        
        return result
    }
}