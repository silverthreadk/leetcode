class MyQueue() {
    val s1 = Stack<Int>()
    val s2 = Stack<Int>()

    fun push(x: Int) {
        while(!s1.isEmpty()){
            s2.push(s1.pop())
        }
        s2.push(x)
        while(!s2.isEmpty()){
            s1.push(s2.pop())
        }
    }

    fun pop(): Int {
        return s1.pop()
    }

    fun peek(): Int {
        return s1.peek()
    }

    fun empty(): Boolean {
        return s1.isEmpty()
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */