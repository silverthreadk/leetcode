class Solution {
public:
    int numSubarraysWithSum(vector<int>& A, int S) {
        int result = 0;
        map<int, int> count;
        int sum = 0;
        
        int n = A.size();
        for(int i=0; i<n; ++i) {
            sum += A[i];
            if(sum - S >= 0) result += count[sum-S];
            if(sum == S) ++result;
            ++count[sum];
        }
        
        return result;
    }
};