class StockSpanner() {
    
    val stock = Stack<Pair<Int, Int>>()
    
    fun next(price: Int): Int {
        var result = 1
        
        while(stock.isNotEmpty() && stock.peek().first <= price) {
                result += stock.pop().second
        }
        stock.push(Pair(price, result))
        
        return result
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * var obj = StockSpanner()
 * var param_1 = obj.next(price)
 */