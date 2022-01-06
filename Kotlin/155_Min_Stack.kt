class MinStack() {
    var s1 = Stack<Int>()
    var s2 = Stack<Int>()

    fun push(`val`: Int) {
        if(s2.empty() || s2.peek() >= `val`) s2.push(`val`)
        s1.push(`val`)
    }

    fun pop() {
        if(s1.empty() || s1.peek() == s2.peek()) s2.pop()
        s1.pop()
    }

    fun top(): Int {
        return s1.peek()
    }

    fun getMin(): Int {
        return s2.peek()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */