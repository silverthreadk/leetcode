class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        if(amount == 0) return 0;
            
        vector<int> dp(amount+1, amount+1);
        
        for(int i=1; i<=amount; ++i){
            for(auto& coin : coins){
                if(i<coin) continue;
                else if(i==coin) dp[i] = 1;
                else dp[i] = min(dp[i], dp[i-coin]+1);
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
    }
};