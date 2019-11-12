class Solution {
public:
    int maxScoreSightseeingPair(vector<int>& A) {
        int result = 0;
        int prev_spot = A[0];
        for(int i=1; i<A.size(); ++i){
            result = max(result, prev_spot+A[i]-i);
            prev_spot = max(prev_spot, A[i] + i);
        }
        return result;
    }
};