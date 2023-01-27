class Solution {
public:
    int findMaxK(vector<int>& nums) {
        int result = -1;
        vector<int> v(1001, 0);

        for(auto& num : nums) {
            if(num < 0) {
                v[-num] += 1;
            }
        }

        for(auto& num : nums) {
            if (num > 0 && v[num] > 0) {
                result = max(result, num);
            }
        }

        return result;
    }
};