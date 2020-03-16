class Solution {
public:
    int longestOnes(vector<int>& A, int K) {
        queue<int> zero_index;
        int flip_count = 0;
        int max_consecutive_ones = 0;
        int consecutive_ones = 0;
        for(int i=0; i<A.size(); ++i){
            if(A[i] == 1) {
                ++consecutive_ones;
            } else if(K == 0) {
                consecutive_ones = 0;
            } else {
                if(flip_count == K) {
                    consecutive_ones = i-zero_index.front();
                    zero_index.pop();
                } else {
                    ++consecutive_ones;
                    ++flip_count;
                }
                zero_index.push(i);
            }
            max_consecutive_ones = max(max_consecutive_ones, consecutive_ones);
        }
        
        return max_consecutive_ones;
    }
};