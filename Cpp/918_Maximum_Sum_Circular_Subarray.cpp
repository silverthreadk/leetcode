class Solution {
public:
    int maxSubarraySumCircular(vector<int>& A) {
        int max_sum = A[0];
        int sum1 = A[0];
        int min_sum = A[0];
        int sum2 = A[0];
        int total_sum = A[0];
        
        for(int i=1; i<A.size(); ++i){
            total_sum += A[i];
            
            sum1 = max(A[i], sum1 + A[i]);
            max_sum = max(max_sum, sum1);
            
            sum2 = min(A[i], sum2 + A[i]);
            min_sum = min(min_sum, sum2);
        }
        if(max_sum<0 && total_sum<0) return max_sum;
        
        return max(max_sum, total_sum - min_sum);
    }
};