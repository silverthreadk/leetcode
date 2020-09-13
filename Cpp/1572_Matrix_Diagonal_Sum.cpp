class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int result = 0;
        int n = mat.size();
        for(int i=0; i<n; ++i){
            result += mat[i][i];
            result += mat[i][n-1-i];
        }
        
        if(n & 1){
            result -= mat[n/2][n/2];
        }
        
        return result;
    }
};