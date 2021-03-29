class MyStack() {

    /** Initialize your data structure here. */
    val queue = ArrayDeque<Int>()

    /** Push element x onto stack. */
    fun push(x: Int) {
        val size = queue.size
        queue.offer(x)
        for (i in 0..size - 1){
            queue.offer(queue.poll())
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        return queue.poll()
    }

    /** Get the top element. */
    fun top(): Int {
        return queue.peek()
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return queue.isEmpty()
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */