class Solution {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = Stack<Int>()
        var count = 0
        
        pushed.forEach{
            stack.push(it)
            while (stack.isNotEmpty() && stack.peek() == popped[count]) {
                stack.pop()
                ++count
            }
        }
        
        return stack.isEmpty()
    }
}