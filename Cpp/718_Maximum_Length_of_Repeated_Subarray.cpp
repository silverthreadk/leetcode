class Solution {
public:
    int findLength(vector<int>& A, vector<int>& B) {
        int result = 0;
        vector<vector<int>> dp(A.size()+1, vector<int>(B.size()+1));
        
        for(int i=0; i<A.size(); ++i){
            for(int j=0; j<B.size(); ++j){
                if(A[i] == B[j]){
                    dp[i+1][j+1] = dp[i][j] + 1;
                    result = max(result, dp[i+1][j+1]);
                }
            }
        }
        
        return result;
    }
};