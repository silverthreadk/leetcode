class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& A) {
        int m = A.size();
        int n = A[0].size();
        vector<vector<int>> result(m, vector<int>(n));
        for(int i=0; i<m; ++i){
            for(int j=n-1; j>=0; --j){
                result[i][n-j-1] = A[i][j] ^ 1;
            }
        }
        
        return result;
    }
};