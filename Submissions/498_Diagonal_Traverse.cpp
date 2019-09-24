class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        if(matrix.empty()) return result;
        
        int M = matrix.size();
        int N = matrix[0].size();
        int MN = 0;
        while(MN < M+N){
            if(MN%2==1){
                int low = max(MN-N+1, 0);
                int high = min(MN, M-1);
                for(int i=low; i<=high; ++i){
                    result.push_back(matrix[i][MN-i]);
                }
            } else {
                int low = max(MN-M+1, 0);
                int high = min(MN, N-1);
                for(int i=low; i<=high; ++i){
                    result.push_back(matrix[MN-i][i]); 
                }
            }
            ++MN;
        }
        return result;
    }
};