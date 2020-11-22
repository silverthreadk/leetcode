class Solution {
public:
    int maxRotateFunction(vector<int>& A) {
        if(A.empty()) return 0;
        
        int n = A.size();
        long result = INT_MIN;
        long sum = 0;
        long rotation = 0;
        for(int i=0; i<n; ++i){
            rotation += A[i]*i;
            sum += A[i];
        }
        result = rotation;
        
        for(int i=0; i<n-1; ++i){
            rotation -= sum;
            rotation += long(A[i]) * n;
            result = max(result, rotation);
        }
        
        return result;
    }
};