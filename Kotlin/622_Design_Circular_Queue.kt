class MyCircularQueue(k: Int) {
    private val q = IntArray(k + 1) { -1 }
    private var front = 0
    private var rear = 0
    
    fun enQueue(value: Int): Boolean {
        if(isFull()) return false

        q[rear] = value
        rear = (rear + 1) % (q.size)
        
        return true
    }

    fun deQueue(): Boolean {
        if(isEmpty()) return false
        
        front = (front + 1) % q.size
        
        return true
    }

    fun Front(): Int {
        if(isEmpty()) return -1
        
        return q[front]
    }

    fun Rear(): Int {
        if(isEmpty()) return -1
        
        return q[(rear - 1 + q.size) % q.size]
    }

    fun isEmpty(): Boolean {
        return front == rear
    }

    fun isFull(): Boolean {
        return (rear + 1) % q.size == front
    }

}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * var obj = MyCircularQueue(k)
 * var param_1 = obj.enQueue(value)
 * var param_2 = obj.deQueue()
 * var param_3 = obj.Front()
 * var param_4 = obj.Rear()
 * var param_5 = obj.isEmpty()
 * var param_6 = obj.isFull()
 */