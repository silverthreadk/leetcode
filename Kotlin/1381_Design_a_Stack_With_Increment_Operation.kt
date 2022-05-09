class CustomStack(private val maxSize: Int) {
    private val stack = Array(maxSize) { -1 }
    private var top = 0
    
    fun push(x: Int) {
        if (top == maxSize) return
        stack[top++] = x
    }

    fun pop(): Int {
        if(top == 0) {
            return -1
        }else {
            return stack[--top]
        }
    }

    fun increment(k: Int, `val`: Int) {
        val end = minOf(k, top)
        for(i in 0 until end) {
            stack[i] += `val`
        }
    }

}

/**
 * Your CustomStack object will be instantiated and called as such:
 * var obj = CustomStack(maxSize)
 * obj.push(x)
 * var param_2 = obj.pop()
 * obj.increment(k,`val`)
 */