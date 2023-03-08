class Solution {
public:
    int triangularSum(vector<int>& nums) {
        vector<int> result = nums;

        while(result.size() != 1) {
            for(int i = 0; i < result.size() - 1; ++i) {
                result[i] = (result[i] + result[i + 1]) % 10;
            }                
            result.pop_back();
        }
        
        return result[0];
    }
};