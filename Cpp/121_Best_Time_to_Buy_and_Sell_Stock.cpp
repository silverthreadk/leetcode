class Solution {
public:
    int maxProfit(vector<int>& prices) {
        if(prices.empty()) return 0;
        
        int min_price = prices.front();
        int result = 0;
        for(auto& price: prices){
            if(min_price > price) {
                min_price = price;
            } else {
                result = max(result, price - min_price);
            }
        }
        return result;
    }
};