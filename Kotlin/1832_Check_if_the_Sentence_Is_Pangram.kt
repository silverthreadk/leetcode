class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        return sentence.toSet().size == 26
    }
}