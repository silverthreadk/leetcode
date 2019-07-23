class Solution {
public:
    int sumSubseqWidths(vector<int>& A) {
        long result = 0;
        sort(A.begin(), A.end());
        int n = A.size();
        long p = 1;
        for(int i=0; i<n; ++i){
            result = (result + (A[i] - A[n-1-i]) * p) % static_cast<int>(1e9+7);
            p = (p * 2) % static_cast<int>(1e9+7);    
        }
        
        return result;
    }
};