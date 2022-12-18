class Solution {
public:
    int mincostTickets(vector<int>& days, vector<int>& costs) {
        vector<int> dp(days.back() + 1);
        unordered_set<int> s(days.begin(), days.end());
        
        dp[0] = 0;
        
        for(int i = 1; i < dp.size(); ++i) {
            if(s.find(i) == s.end()) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = min({costs[0] + dp[i - 1], costs[1] + dp[max(0, i - 7)], costs[2] + dp[max(0, i - 30)]});
            }
        }
        
        return dp.back();
    }
};