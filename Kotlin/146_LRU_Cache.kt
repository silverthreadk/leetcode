class LRUCache(capacity: Int) {
    private val capacity = capacity
    private val m: MutableMap<Int, Int> = LinkedHashMap()

    fun get(key: Int): Int {
        val v = m.getOrDefault(key, -1)
        if(v != -1) {
            m.remove(key)
            m[key] = v
        }
        
        return v
    }

    fun put(key: Int, value: Int) {
        if(m.contains(key)) m.remove(key)
        else if(m.size == capacity) m.remove(m.keys.first())
        m[key] = value
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */