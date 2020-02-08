class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) { 
        int n = triangle.size();
        if(n == 1) return triangle[0][0];
        
        vector<int> dp(n, 0);
        dp[0] = triangle[0][0] + triangle[1][0];
        dp[1] = triangle[0][0] + triangle[1][1];
        
        for(int i=2; i<n; ++i){
            int m = triangle[i].size();
            dp[m-1] = dp[m-2] + triangle[i][m-1];
            for(int j=m-2; j>0; --j){
                dp[j] = min(dp[j-1], dp[j]) + triangle[i][j];
            }
            dp[0] = dp[0] + triangle[i][0];
        }
        
        return *min_element(dp.begin(), dp.end()); 
    }
};