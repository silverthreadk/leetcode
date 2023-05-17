class Solution {
    fun squareIsWhite(coordinates: String): Boolean {
        return (coordinates[0].toInt() + coordinates[1].toInt()) % 2 == 1
    }
}