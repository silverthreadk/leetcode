class TimeMap() {
    val m: MutableMap<String, TreeMap<Int, String>> = mutableMapOf()

    fun set(key: String, value: String, timestamp: Int) {
        val timeMap = m.getOrPut(key){ TreeMap() }
        timeMap[timestamp] = value
    }

    fun get(key: String, timestamp: Int): String {
        return m[key]?.floorEntry(timestamp)?.value ?: ""
    }

}

/**
 * Your TimeMap object will be instantiated and called as such:
 * var obj = TimeMap()
 * obj.set(key,value,timestamp)
 * var param_2 = obj.get(key,timestamp)
 */