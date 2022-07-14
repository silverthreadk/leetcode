class Cashier(private val n: Int, private val discount: Int, private val products: IntArray, private val prices: IntArray) {
    private var customer = 0
    private val productsIndex = hashMapOf<Int, Int>()
    
    init {
        for(i in 0 until products.size){
            productsIndex.put(products[i], i)
        }
    }

    fun getBill(product: IntArray, amount: IntArray): Double {
        ++customer
        var sum = 0.0
        for(i in 0 until product.size){
            sum += prices[productsIndex.get(product[i])!!] * amount[i]
        }
        if(customer % n == 0){
            customer = 0
            sum -= sum / 100 * discount
        }
        
        return sum
    }

}

/**
 * Your Cashier object will be instantiated and called as such:
 * var obj = Cashier(n, discount, products, prices)
 * var param_1 = obj.getBill(product,amount)
 */