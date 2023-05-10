class Solution {
public:
    int minimumCost(vector<int>& cost) {
        int result = 0;
        int count = 0;

        sort(cost.begin(), cost.end());
        for(int i = cost.size() - 1; i >= 0; --i) {
            if(count == 2) {
                count = 0;
                continue;
            }
            
            result += cost[i];
            ++count;
        }

        return result;
    }
};