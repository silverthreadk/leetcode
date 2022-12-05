class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        var result = 0
        costs.sort()
        
        var totalPrice = 0
        for(cost in costs) {
            totalPrice += cost
            if(totalPrice > coins) return result
            
            ++result
        }
        
        return result
    }
}