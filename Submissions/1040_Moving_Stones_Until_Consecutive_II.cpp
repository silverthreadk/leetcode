class Solution {
public:
    vector<int> numMovesStonesII(vector<int>& stones) {
        sort(stones.begin(), stones.end());

        int n = stones.size();
        int min_move = n;
        int max_count = 0;

        if (stones[n-1] - stones[0] != n && stones[n-2] - stones[0] == n - 2 ^ stones[n-1] - stones[1] == n - 2) min_move = 2;
        else {
            for(int i=0; i<n; ++i){    
                int count = 0;
                for(int j = i; j < n && stones[j] < stones[i] + n ; ++j) {
                    count += 1;
                }
                max_count = max(max_count, count);
            }
            min_move = n - max_count;
        }
        
        int max_move = max_move = max(stones[n-1] - stones[1],  stones[n-2] - stones[0]) - n + 2;
        
        vector<int> result;
        result.push_back(min_move);
        result.push_back(max_move);
        
        return result;
    }
};