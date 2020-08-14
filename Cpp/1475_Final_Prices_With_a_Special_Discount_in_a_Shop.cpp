class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        vector<int> result(prices.size(), 0);
        stack<int> s;
        for(int i=prices.size()-1; i>=0; --i){
            while (!s.empty() && s.top() > prices[i]) {
                s.pop();
            }
            result[i] = s.empty() ? prices[i] : prices[i] - s.top();
            s.push(prices[i]);
        }
        
        return result;
    }
};