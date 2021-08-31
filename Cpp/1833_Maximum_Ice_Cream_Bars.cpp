class Solution {
public:
    int maxIceCream(vector<int>& costs, int coins) {
        int result = 0;
        sort(costs.begin(), costs.end());
        
        int total_price = 0;
        for(auto& cost : costs) {
            total_price += cost;
            if(total_price > coins) return result;
            
            ++result;
        }
        
        return result;
    }
};