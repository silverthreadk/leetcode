class Solution {
    fun calPoints(ops: Array<String>): Int {
        val s = Stack<Int>()
        
        for(operation in ops) {
            when(operation) {
                "+" -> s.push(s[s.size - 1] + s[s.size - 2])
                "D" -> s.push(s.peek() * 2)
                "C" -> s.pop()
                else -> s.push(operation.toInt())
            }
        }
        
        return s.sum()
    }
}