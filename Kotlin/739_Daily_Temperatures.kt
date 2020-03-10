class Solution {
    fun dailyTemperatures(T: IntArray): IntArray {
        var result = IntArray(T.size){0}
        var s = Stack<Int>()
        for (i in 0..T.size-2) {
            if(T[i+1] > T[i]) {
                result[i] = 1
            } else {
                s.push(i)
            }
            while(!s.empty() && T[i+1] > T[s.peek()]) {
                result[s.peek()] = i - s.peek() + 1
                s.pop()
            }
        }
        
        return result
    }
}