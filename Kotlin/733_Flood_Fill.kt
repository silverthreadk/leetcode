class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        recursive(image, sr, sc, newColor, image[sr][sc])
        return image
    }
    
    fun recursive(image: Array<IntArray>, row: Int, col: Int, newColor: Int, initialColor: Int): Unit {
        if(row < 0 || col < 0 || row > image.lastIndex || col > image[0].lastIndex
           || image[row][col] == newColor || image[row][col] != initialColor) return
        
        image[row][col] = newColor
        recursive(image, row + 1, col, newColor, initialColor)
        recursive(image, row - 1, col, newColor, initialColor)
        recursive(image, row, col + 1, newColor, initialColor)
        recursive(image, row, col - 1, newColor, initialColor)
    }
}