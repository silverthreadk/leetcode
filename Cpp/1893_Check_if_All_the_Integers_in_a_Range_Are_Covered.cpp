class Solution {
public:
    bool isCovered(vector<vector<int>>& ranges, int left, int right) {
        vector<int> dp(52, 0);
        for(int i = 0; i < ranges.size(); ++i) {            
            ++dp[ranges[i][0]];
            --dp[ranges[i][1] + 1];
        }

        for(int i = 1; i < 52; ++i) {
            dp[i] += dp [i - 1];
        }

        for(int i = left; i <= right; ++i) {
            if(dp[i] == 0) return false;
        }

        return true;
    }
};