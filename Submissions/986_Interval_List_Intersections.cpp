class Solution {
public:
    vector<vector<int>> intervalIntersection(vector<vector<int>>& A, vector<vector<int>>& B) {
        vector<vector<int> > result;
        int i = 0, j = 0;
        int m = A.size(), n = B.size();
        
        while(i<m && j<n){
            int low = max(A[i][0], B[j][0]);
            int high = min(A[i][1], B[j][1]);
            if(low <= high){
                result.push_back({low, high});
            }
            if(A[i][1] < B[j][1]) ++i;
            else ++j;
        }
        
        return result;
    }
};