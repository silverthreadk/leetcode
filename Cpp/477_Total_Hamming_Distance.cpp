class Solution {
public:
    int totalHammingDistance(vector<int>& nums) {
        int result = 0;
        
        for(int i = 0; i < 32; ++i) {
            int ones = 0;
            for(int item : nums) {
                if(item & (1 << i)) ++ones;
            }
            result += ones * (nums.size() - ones);
        }
        
        return result;
    }
};