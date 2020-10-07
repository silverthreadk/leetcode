class Cashier {
public:
    Cashier(int n, int discount, vector<int>& products, vector<int>& prices) : customer(0), n(n), discount(discount), prices(prices) {
        for(int i=0; i<products.size(); ++i){
            products_index[products[i]] = i;
        }
    }
    
    double getBill(vector<int> product, vector<int> amount) {
        ++customer;
        double sum = 0;
        for(int i=0; i<product.size(); ++i){
            sum += prices[products_index[product[i]]]*amount[i];
        }
        if(customer % n == 0){
            customer = 0;
            sum -= sum/100*discount;
        }
        
        return sum;
    }

private:
    int customer;
    int n;
    int discount;
    unordered_map<int, int> products_index;
    vector<int> prices;
};

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier* obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj->getBill(product,amount);
 */