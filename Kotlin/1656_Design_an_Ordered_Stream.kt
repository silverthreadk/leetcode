class OrderedStream(n: Int) {
    private var streams = Array<String>(n + 1) {""}
    private var ptr = 1
    
    fun insert(idKey: Int, value: String): List<String> {
        val result = mutableListOf<String>()
        streams[idKey] = value
        
        if (ptr != idKey) return result
        
        while (ptr < streams.size && streams[ptr].isNotEmpty()) {
            result.add(streams[ptr++])
        }
        
        return result
    }

}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * var obj = OrderedStream(n)
 * var param_1 = obj.insert(idKey,value)
 */