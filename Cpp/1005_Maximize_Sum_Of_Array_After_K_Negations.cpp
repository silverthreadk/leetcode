class Solution {
public:
    int largestSumAfterKNegations(vector<int>& A, int K) {
        int result = 0;
        int min_value = INT_MAX;
        priority_queue<int, vector<int>, greater<int>> pq;
        for(int i=0; i<A.size(); ++i){
            result += A[i];
            pq.push(A[i]);
            min_value = min(min_value, abs(A[i]));
        }
        
        if(pq.top() >= 0) return result - (K&1 == 1) * 2 * min_value;
        
        for(int i=0; i<K; ++i){
            if(pq.top() > 0) return result - ((K-i)&1 == 1) * 2 * min_value;
            result += -2*pq.top();
            pq.pop();
        }
        
        return result;
    }
};